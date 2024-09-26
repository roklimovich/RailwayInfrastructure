## Project Title

Railway Infrastructure

## Description

This project is a simulation tool for managing and maintaining railway infrastructure logistics.
The application allows users to manage railway stations, connections, line intersections, trainsets, and more through
a graphical user interface (GUI). The core functionality involves creating and controlling trainsets
(composed of locomotives and railroad cars) while simulating their movements and logistics across a graph of railway
stations.

## Features

* **Create and Manage Trainsets:**

    * Create locomotives, railroad cars, and railway stations.

    * Connect railroad cars to locomotives.

    * Load cargo or passengers into railroad cars.

    * Remove trains, stations, and other objects.

* **Locomotive Details:**

    * Maximum number of railroad cars.

    * Maximum weight of transported load.

    * Electric grid connections for certain types of railroad cars.**

    * Automatic unique identification number assignment.

    * Variable speed changes (random 3% increase or decrease every second).

* **Railroad Car Types:**

    * Passenger, postal, baggage, restaurant, and multiple freight car types, including specialized cars
      (e.g., refrigerated, toxic material cars).

* **Trainset Movement:**

    * Trainsets move along routes between railway stations.

    * Each trainset stops for 2 seconds at each station and 30 seconds at the destination before returning.

    * Collision prevention to ensure only one trainset moves between two stations at a time.

    * Random route generation using graph algorithms.

* **Thread Management:**

    * Time-based operations (e.g., speed changes, station stops) are managed using Java’s ``Thread`` class.

    * Careful thread synchronization ensures smooth trainset movement and collision prevention.

* **Exception Handling:**

    * When trainsets exceed 200 km/h, a ``RailroadHazard`` exception is raised with details about the trainset.

    * All exceptions are handled gracefully without interrupting the application.

* **Reporting:**

    * Generate detailed reports about trainsets, including:

        * Basic information about the locomotive and railroad cars.

        * Percentage of the route completed.

        * Information about passengers or cargo.

    * Report progress between stations and store data in a text file ``Info.txt``, updated every 5 seconds.

## Usage

1. Creating Objects:

    * Use the GUI to create locomotives, railroad cars, and railway stations.

    * Add and connect railroad cars to locomotives and assign routes.

2. Simulating Train Movement:

    * The trainsets will move automatically between stations, following the routes defined by the connections.

    * Train speeds will vary randomly, and all trainsets will stop at stations as per the schedule.

3. Handling Collisions:

    * Only one trainset can occupy a track between two stations at a time. Any additional trainsets must wait until the
      track is cleared.

4. Reporting:

    * Enter the trainset identifier to get a full report on its status, distance covered, and other relevant details.

    * Data is continuously updated in ``Info.txt``, and trainsets and railroad cars are sorted based on weight and route
      length.

## Requirements

1. Java Development Kit (JDK) 8 or later.

2. Basic understanding of Java programming (including collections, interfaces, abstract classes, and lambdas).

## How to Run

1. Ensure you have Java installed.
2. Compile the Java files and run the main program.
3. Use the GUI to interact with the program, create trainsets, and simulate railway logistics.

## License

This project is for educational purposes and is subject to academic integrity rules.
Plagiarism will result in disciplinary action.

## Author

Roman Klimovich

## Lecturer

Sławomir Aleksander Dańczak, M.Sc. PJAIT
