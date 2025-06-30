#define LED_PIN_COLOR 3
#define delayTime 50


void setup() {
  pinMode(LED_PIN_COLOR,OUTPUT);
}

void loop() {
  digitalWrite(LED_PIN_COLOR,HIGH);
  delay(delayTime);
  digitalWrite(LED_PIN_COLOR,LOW);
  delay(delayTime);
}
