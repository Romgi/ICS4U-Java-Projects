//Jonathan Graydon
//Circle Drawing
//This program will draw randomly coloured circles following the cursor

void setup() {
    size(600, 400);
}

void draw() {
    float red = random(0, 255);
    float green = random(0, 255);
    float blue = random(0, 255);

    fill(red, green, blue);
    ellipse(mouseX, mouseY, 10, 10);
}
