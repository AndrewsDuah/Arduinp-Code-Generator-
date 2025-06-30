#include <Servo.h>
#define ServoPin 5
#define delayTime 200
#define servoPosition 150
Servo myServo;


void setup() {
  myServo.attach(ServoPin);
}

void loop() {
  myServo.write(servoPosition);
  delay(delayTime);
}
