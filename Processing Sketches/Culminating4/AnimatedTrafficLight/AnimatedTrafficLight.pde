//Jonathan Graydon
//Animated Traffic Light
//This program will draw a traffic light and a car and animate them

// Traffic Light Animation in Processing
int state = 0; // 0 = Green, 1 = Yellow, 2 = Red
int timer = 0; // Timer to track transitions
int carX = -50; // Initial position of the car
boolean carMoving = true;

void setup() {
  size(400, 600);
  frameRate(30); // Set frame rate for smooth animation
}

void draw() {
  background(220);
  drawTrafficLight();
  displayStateText();
  updateState();
  animateCar();
}

void drawTrafficLight() {
  // Draw the traffic light box
  fill(50);
  rect(150, 100, 100, 300, 10);

  // Draw the lights
  if (state == 0) {
    fill(0, 255, 0); // Green light
    ellipse(200, 150, 50, 50);
    fill(100);
    ellipse(200, 250, 50, 50);
    ellipse(200, 350, 50, 50);
  } else if (state == 1) {
    fill(100);
    ellipse(200, 150, 50, 50);
    fill(255, 255, 0); // Yellow light
    ellipse(200, 250, 50, 50);
    fill(100);
    ellipse(200, 350, 50, 50);
  } else {
    fill(100);
    ellipse(200, 150, 50, 50);
    ellipse(200, 250, 50, 50);
    fill(255, 0, 0); // Red light
    ellipse(200, 350, 50, 50);
  }
}

void displayStateText() {
  fill(0);
  textSize(20);
  textAlign(CENTER);
  if (state == 0) {
    text("Go", width / 2, 450);
  } else if (state == 1) {
    text("Ready", width / 2, 450);
  } else {
    text("Stop", width / 2, 450);
  }
}

void updateState() {
  timer++;
  if (state == 0 && timer >= 150) { // Green light for 5 seconds
    state = 1;
    timer = 0;
    carMoving = false;
  } else if (state == 1 && timer >= 60) { // Yellow light for 2 seconds
    state = 2;
    timer = 0;
  } else if (state == 2 && timer >= 150) { // Red light for 5 seconds
    state = 0;
    timer = 0;
    carMoving = true;
  }
}

void animateCar() {
  if (carMoving) {
    carX += 2;
    if (carX > width) {
      carX = -50; // Reset car position
    }
  }

  // Draw the car
  fill(0, 0, 255);
  rect(carX, 500, 50, 30);
  fill(0);
  ellipse(carX + 10, 530, 10, 10);
  ellipse(carX + 40, 530, 10, 10);
}
