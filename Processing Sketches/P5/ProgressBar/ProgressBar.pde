//Jonathan Graydon
//Progress Bar
//This program will display a progress bar animation

int barWidth = 300;
int barHeight = 30;
int x = 50;
int y = 100;
float progress = 0;
float duration = 10.0;

void setup() {
  size(400, 200);
  frameRate(60);
}

void draw() {
  background(240);

  // Calculate the progress based on the elapsed time
  progress = min(1, millis() / (duration * 1000.0));

  // Draw the progress bar background
  fill(200);
  rect(x, y, barWidth, barHeight);

  // Draw the filled part of the progress bar
  fill(0, 255, 0);
  rect(x, y, barWidth * progress, barHeight);

//Draws the end text
  if (progress >= 1) {
    textSize(20);
    text("Done!", width / 2, y + barHeight + 30);
  }
}
