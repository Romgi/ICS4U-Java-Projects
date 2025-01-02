//Jonathan Graydon
//Digital Stopwatch
//This program will draw a digital stopwatch

int startTime;

void setup() {
  size(400, 200);
  textAlign(CENTER, CENTER);
  textSize(32);
  startTime = millis();
}

void draw() {
  background(240);

  int elapsedTime = millis() - startTime;

  int seconds = (elapsedTime / 1000) % 60;
  int minutes = (elapsedTime / 1000) / 60;

  // Format the time as MM : SS
  String timeString = nf(minutes, 2) + " : " + nf(seconds, 2);

  // Display the stopwatch
  fill(0);
  text(timeString, width / 2, height / 2);
}
