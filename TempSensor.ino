#include <DHT.h>
#define DHTPin 2
#define Type DHT11
float humidity;
float tempC;
float tempF;
#define delayTime 500
DHT TempSensor(DHTPin, Type);


void setup() {
  Serial.begin(9600);
  // you can change the baud rate to your desired one
  TempSensor.begin();

}

void loop() {
  humidity = TempSensor.readHumidity();
  tempC = TempSensor.readTemperature();
  tempF = TempSensor.readTemperature(true);
  Serial.print("Humidity: ");
  Serial.print(humidity);
  Serial.print(" ");
  Serial.print("Temperature(C): ");
  Serial.print(tempC);
  Serial.print(" ");
  Serial.print("Temperature(F): ");
  Serial.println(tempF);
  delay(delayTime);
}
