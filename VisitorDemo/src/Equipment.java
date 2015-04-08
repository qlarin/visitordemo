
public class Equipment implements EquipmentPart{

	EquipmentPart[] parts;
	
	public Equipment(){
		parts = new EquipmentPart[] {
				new Armour(),
				new Weapon()
		};
	}

	@Override
	public void accept(EquipmentPartVisitor equipmentPartVisitor) {
		for(int i = 0; i < parts.length; i++){
			parts[i].accept(equipmentPartVisitor);
		}
		equipmentPartVisitor.visit(this);
	}
}
