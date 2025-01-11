//Jonathan Graydon
//Interactive Grid
//This program will highlight the portion of the screen where the mouse is

void setup() {
    size(600, 600);
}

void draw() {
    int columns = 4;
    int rows = 4;
    int cellWidth = width / columns;
    int cellHeight = height / rows;

    for (int i = 0; i < columns; i++) {
        for (int j = 0; j < rows; j++) {
            int x = i * cellWidth;
            int y = j * cellHeight;
            if (mouseX > x && mouseX < x + cellWidth && mouseY > y && mouseY < y + cellHeight) {
                fill(255, 0, 0);
            } else {
                fill(0);
            }
            rect(x, y, cellWidth, cellHeight); 
        }
    }
}
