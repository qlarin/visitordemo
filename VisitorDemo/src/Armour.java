
public class Armour implements EquipmentPart{

	@Override
	public void accept(EquipmentPartVisitor equipmentPartVisitor) {
		equipmentPartVisitor.visit(this);

	}
}
