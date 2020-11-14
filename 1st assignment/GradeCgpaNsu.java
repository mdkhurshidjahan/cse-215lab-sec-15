
package grade.cgpa.nsu;

import java.util.*;

public class GradeCgpaNsu {

   
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        while (true) {
            int i = 0;
            int temp;
            int cr = 0;
            float gpa = 0;
            int z;
            int p;
            int x;
            int g;

            System.out.println("enter ");
            int n = sc.nextInt();
            String[] sub;
            sub = new String[n];
            int[] arr = new int[n];
            float[] ar1 = new float[n];
            float[] ar2 = new float[n];
            float[] ar3 = new float[n];

            while (true) {
                while (i < n) {
                    /*for (int j = i; j < i + 1; j++) {

                        sub[j] = sc.nextLine();

                    }*/
                    for (z = i; z < i + 1; z++) {

                        System.out.println("enter credit");
                        arr[z] = sc.nextInt();
                        cr = cr + arr[z];

                    }
                    for (p = i; p < i + 1; p++) {
                        System.out.println("number:");
                        ar2[p] = sc.nextFloat();
                        float result = gpa_calculator(ar2[p], i);
                        if (result == 0) {
                            cr = cr - arr[p];

                        }
                        for (x = i; x < i + 1; x++) {
                            ar3[x] = result;

                        }
                    }
                    for (g = i; g < i + 1; g++) {
                        ar3[g] = ar3[g] * arr[g];
                        gpa = gpa + ar3[g];

                    }
                    System.out.print("\n");
                    i++;

                }
                float cg = gpa / cr;
                System.out.println("Your Cgpa=" + cg);
                break;

            }

        }

    }

    static float gpa_calculator(float num, int a) {
        //Scanner ss = new Scanner(System.in);
        float grd = 0;

        if (num >= 93) {
            return grd = 4.0f;
        } else if (num >= 90 && num <= 92) {
            return grd = 3.7f;
        } else if (num >= 90 && num <= 92) {
            return grd = 3.7f;
        } else if (num >= 87 && num <= 89) {
            return grd = 3.3f;
        } else if (num >= 83 && num <= 86) {
            return grd = 3.0f;
        } else if (num >= 80 && num <= 82) {
            return grd = 2.7f;
        } else if (num >= 77 && num <= 79) {
            return grd = 2.3f;
        } else if (num >= 73 && num <= 76) {
            return grd = 2.0f;
        } else if (num >= 70 && num <= 72) {
            return grd = 1.7f;
        } else if (num >= 67 && num <= 69) {
            return grd = 1.3f;
        } else if (num >= 60 && num <= 66) {
            return grd = 1.0f;
        }
        return 0;

    }

}
