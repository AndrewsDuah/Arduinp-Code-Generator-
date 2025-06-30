
## 🔌 Arduino Code Generator (Java-Based)

This Java application dynamically generates complete Arduino `.ino` sketches based on selected hardware components. Users can define components like LEDs and buzzers, assign pins, and automatically produce a full, ready-to-upload Arduino program — no manual coding required.

### 🧠 Key Features:

* **Object-Oriented Design**: Abstract `Component` class with extensible subclasses (e.g., `Buzzer`, `LED`).
* **Dynamic Code Generation**: Outputs all necessary Arduino code sections including declarations, setup, and loop.
* **Pin Management**: Ensures no conflicts by validating pin assignments during component creation.
* **Library Injection**: Automatically includes only required Arduino libraries.
* **Scalable Architecture**: Easily extendable to support more components (e.g., sensors, servos, displays).

### 📁 Files Included:

* `Main.java` – Entry point for running the generator with sample components.
* `BuzzerClass.java` – Defines buzzer behavior and code generation logic.
* `LedClass.java` – Defines led behavior and code generation logic.
* `ServoClass.java` – Defines Servo behavior and code generation logic.
* `DHT11Class.java` – Defines DHT11 behavior and code generation logic.
* `GenCode.java` – Central code generator that aggregates all component code into a full Arduino sketch.

### 🛠️ Ideal For:

* Beginners looking to understand hardware-software integration.
* Embedded systems students exploring code automation.
* Developers who frequently prototype with Arduino and want to save setup time.


Snipper of Code Output 

![image](https://github.com/user-attachments/assets/dabc4a53-7092-4bf5-9921-c48054d2bc75)



