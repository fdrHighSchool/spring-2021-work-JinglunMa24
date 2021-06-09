ArrayList<Integer> x = new ArrayList<Integer> ();
ArrayList<Integer> y = new ArrayList<Integer> ();

void setup() {
  size(600, 600);
  rectMode(CENTER);
}

void draw() {
  if (mousePressed) {
    x.add(0, mouseX);
    y.add(0, mouseY);
    fill(128, 128, 128);
    rect(x.get(0), y.get(0), 80, 80);
  }
}
