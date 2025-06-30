#define buzzPin 4
#define delayTime 500


void setup() {
  pinMode(buzzPin,OUTPUT);
}

void loop() {
  digitalWrite(buzzPin,HIGH);
  delay(delayTime);
  digitalWrite(buzzPin,LOW);
  delay(delayTime);
}
