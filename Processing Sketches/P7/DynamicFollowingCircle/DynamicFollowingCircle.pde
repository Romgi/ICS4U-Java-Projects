//Jonathan Graydon
//Following Circle
//This program will make a circle follow the mouse cursor
//The circles size is based on its distance from the centre

void setup() {
    size(600, 400);
}

void draw() {
    background(0, 0, 0); // Clear the screen

    float centerX = width / 2.0;
    float centerY = height / 2.0;
    
    float distance = dist(mouseX, mouseY, centerX, centerY);
    float circleSize = map(distance, 0, dist(0, 0, centerX, centerY), 10, 100);
    fill(250, 0, 0);
    ellipse(mouseX, mouseY, circleSize, circleSize);
}
