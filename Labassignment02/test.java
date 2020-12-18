
package Labassignment02;


public class test {
    public static void main(String[]args){System.out.println("User : ");
        User objUser=new User("Md Khurshid jahan",1922079042,"khurshid.jahan@northsouth.edu");
        objUser.setName("Md khurshid Jahan");
        System.out.println(objUser.getName());
        objUser.setId(1922079042);
        System.out.println(objUser.getId());
        objUser.setEmail("khurshid.jahan@northsouth.edu");
        System.out.println(objUser.getEmail());

        System.out.println("Rectangle : ");
        Rectangle objRec=new Rectangle(5,5);
        objRec.setLength(5);
        objRec.setWeidth(5);
        System.out.println(objRec.getLength());
        System.out.println(objRec.getWeidth());
        System.out.println(objRec.recArea(objRec));
        System.out.println(objRec.recPerimeter(objRec));
        objRec.drawRectangle();

        System.out.println("Circle : ");
        Circle objCirc=new Circle(6);
        objCirc.setRadius(3);
        System.out.println(objCirc.getRadius());
        System.out.println(objCirc.cirCumference(objCirc));
        System.out.println(objCirc.cirArea(objCirc));

        System.out.println("Triangle : ");
        Triangle objTri=new Triangle(4,9);
        objTri.setBase(3);
        objTri.setHeight(2);
         System.out.println(objTri.getBase());
        System.out.println(objTri.getHeight());
        System.out.println(objTri.triArea(objTri));
        System.out.println(objTri.triPerimeter(objTri));
        objTri.drawTriangle();
    }
    
}
