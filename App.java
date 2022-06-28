import io.kaitai.struct.ByteBufferKaitaiStream;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
    byte[] data = { (byte) 0xd4 };
        HelloWorld hw = new HelloWorld(new ByteBufferKaitaiStream(data));

        System.out.println("one: " + hw.one());
        if (hw.one() == 212) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
            System.exit(1);
        }
    }
}
