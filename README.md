# Media Library System

## Overview
This project is a Java-based media library system designed to manage media items, member subscriptions, and item loans. It provides a simple interface for tracking and handling media-related operations in a library or rental store.

## Classes
- `Main.java`: The entry point of the application, containing the main method.
- `MediaItem.java`: Represents a media item in the library, with attributes such as title, author, and availability.
- `Mediatheque.java`: Manages the overall media item catalog and member registrations.
- `Member.java`: Represents a member of the library, including personal details and a list of borrowed items.
- `Emprunt.java`: Handles the loan records for media items borrowed by members.

## Getting Started
To run this project, ensure you have a Java Runtime Environment (JRE) installed.

1. Compile the Java files using `javac`:
    ```shell
    javac Main.java MediaItem.java Mediatheque.java Member.java Emprunt.java
    ```
2. Run the compiled `Main` class using `java`:
    ```shell
    java Main
    ```
