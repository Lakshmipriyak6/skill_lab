Weather Station - Observer Pattern Implementation
This project implements a simple Weather Station application using the Observer design pattern in Java. The Observer pattern is used to notify registered observers about changes in the state of the subject (in this case, weather data). This README will guide you through setting up the project in Eclipse, understanding the code structure, and running the application.

Table of Contents
Project Overview
Design Pattern
Prerequisites
Setup Instructions
Project Structure
Running the Application
Customization
Contributing
License
Project Overview
The Weather Station application simulates the collection and distribution of weather data (temperature, humidity, and pressure). The application uses the Observer pattern to decouple the Weather Station (subject) from its displays (observers), allowing multiple displays to receive updates whenever the weather data changes.

Design Pattern
The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects. When one object (the subject) changes its state, all dependent objects (observers) are notified and updated automatically.

Key Components:
Subject (WeatherData): Maintains a list of observers, provides methods for attaching and detaching observers, and notifies observers of any state changes.
Observer (Display): An interface for all observers that defines the update() method.
ConcreteObserver (CurrentConditionsDisplay, ForecastDisplay, etc.): Implements the Observer interface and updates its state based on the subject's state.
ConcreteSubject (WeatherData): Implements the Subject interface and updates the state and notifies observers.
