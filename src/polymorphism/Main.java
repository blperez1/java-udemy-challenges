package polymorphism;

import com.sun.xml.internal.ws.encoding.MtomCodec;

public class Main {
    public static void main(String[] args) {
        Mitsubishi outlander = new Mitsubishi(4, "Outlander");
        System.out.println(outlander.accelerate());
        System.out.println(outlander.brake());
        System.out.println(outlander.brake());

    }
}
