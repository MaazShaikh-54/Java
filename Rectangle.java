class shape {
    int width;
    int height;

    void setWidth(int width) {
        this.width = width;
    }

    void setheight(int height) {
        this.height = height;
    }
}

class Rectangle extends shape {
    int getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setheight(6);
        r.setWidth(8);
        System.out.println("Area : " + r.getArea());
    }
}
