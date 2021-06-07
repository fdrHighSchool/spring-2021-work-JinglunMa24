ArrayList<Integer> x = new ArrayList<Integer> ();
ArrayList<Integer> y = new ArrayList<Integer> ();

void setup() {
  size(600, 600);
  rectMode(CENTER);
}

void draw() {
  x.add(0, mouseX);
  y.add(0, mouseY);
  rect(x.get(0), y.get(0), 80, 80);
}
