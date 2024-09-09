// Payment Method interfaces
interface Payment {
    void makePayment(double amount);
}

// Concrete Payment Methods
class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paying $" + amount + " using PayPal.");
    }
}

class CashPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paying $" + amount + " using Cash.");
    }
}

// Abstract Factory for Payment Methods
abstract class PaymentFactory {
    public abstract Payment createPaymentMethod();

    public static PaymentFactory getFactory(String paymentType) {
        switch (paymentType.toLowerCase()) {
            case "creditcard":
                return new CreditCardFactory();
            case "paypal":
                return new PayPalFactory();
            case "cash":
                return new CashFactory();
            default:
                throw new IllegalArgumentException("Unknown payment method.");
        }
    }
}

class CreditCardFactory extends PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new CreditCardPayment();
    }
}

class PayPalFactory extends PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new PayPalPayment();
    }
}

class CashFactory extends PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new CashPayment();
    }
}
