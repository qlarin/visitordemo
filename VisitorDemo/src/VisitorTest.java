
public class VisitorTest {

	public static void main(String[] args) {

		EquipmentPart eq = new Equipment();
		eq.accept(new EquipmentPartDisplayVisitor());
	}

}
