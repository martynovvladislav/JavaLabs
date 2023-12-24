package ru.mirea.lab6.task1and2;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean sameSpeed() {
        return this.topLeft.xSpeed == this.bottomRight.xSpeed && this.bottomRight.ySpeed == this.topLeft.ySpeed;
    }

    @Override
    public void moveRight() {
        if(this.sameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft() {
        if(this.sameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveDown() {
        if(this.sameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveUp() {
        if(this.sameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
