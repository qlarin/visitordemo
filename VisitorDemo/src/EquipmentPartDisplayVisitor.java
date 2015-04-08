
public class EquipmentPartDisplayVisitor implements EquipmentPartVisitor{

	@Override
	public void visit(Equipment e) {
		System.out.println("That was ur equipment..");
		
	}

	@Override
	public void visit(Armour a) {
		System.out.println("Here is ur Armour");
		
	}

	@Override
	public void visit(Weapon w) {
		System.out.println("Here is ur Weapon");
		
	}
}
