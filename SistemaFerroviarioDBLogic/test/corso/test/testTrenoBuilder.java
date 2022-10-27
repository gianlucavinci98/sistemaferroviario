package corso.test;


import com.corso.builder.TrenoBuilder;
import com.corso.builder.TrenoBuilder.Builder;

public class testTrenoBuilder {

	public static void main(String[] args) {
		testBuilderTreno();

	}

	private static void testBuilderTreno() {
		Builder tb = new Builder();
		TrenoBuilder t = tb.build("HPPP");
		
		System.out.println(t.show());
	}

}
