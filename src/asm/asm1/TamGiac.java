package asm.asm1;

public class TamGiac {
    private float c1;
    private float c2;
    private float c3;

    public TamGiac() {
    }

    public TamGiac(float c1, float c2, float c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1 = c1;
    }

    public float getC2() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2 = c2;
    }

    public float getC3() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3 = c3;
    }

    public boolean checkTamGiac(){
        if(c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1)
            return true;
        return false;
    }

    public float chuVi(){
        return c1 + c2 + c3;
    }

    public double dienTich(){
        float cv2 = chuVi()/2;
        return Math.sqrt(cv2 * (cv2-c1) * (cv2 - c2) * (cv2 - c3));
    }
}
