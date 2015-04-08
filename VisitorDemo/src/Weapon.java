
public class Weapon implements EquipmentPart{

	@Override
	public void accept(EquipmentPartVisitor equipmentPartVisitor) {
		equipmentPartVisitor.visit(this);
	
	}
}
