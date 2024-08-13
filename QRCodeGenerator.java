import net.glxn.qrgen.javase.QRCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class QRCodeGenerator {

    public static void main(String[] args) {
        String text = "https://www.example.com"; // Text to be encoded as QR code

        // Generate QR code
        ByteArrayOutputStream out = QRCode
                .from(text)            // The text or URL to encode
                .withSize(250, 250)    // Size of the QR code
                .stream();             // Generate as a stream

        // Write QR code to a file
        try (FileOutputStream fos = new FileOutputStream(new File("QRCode.png"))) {
            fos.write(out.toByteArray());
            System.out.println("QR Code generated successfully and saved as QRCode.png");
        } catch (IOException e) {
            System.err.println("Failed to save QR Code: " + e.getMessage());
        }
    }
}
