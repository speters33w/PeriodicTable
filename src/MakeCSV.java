import com.ata.Elements;

public class MakeCSV {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(
                "AtomicNumber,Element,Symbol,AtomicMass,NumberOfNeutrons,NumberOfProtons,NumberOfElectrons,Period," +
                "Group,Phase,Radioactive,Natural,Metal,Nonmetal,Metalloid,Type,AtomicRadius,Electronegativity," +
                "FirstIonization,Density,MeltingPoint,BoilingPoint,NumberOfIsotopes,Discoverer,Year,SpecificHeat," +
                "NumberOfShells,NumberOfValence\n");
        for (Elements element : Elements.values()) {
            sb.append(String.format("%s,%s,%.3f,%d,%d,%d,%d,",
                    element.atomicNumber(), element.elementName(), element.mass(), element.neutrons(), element.protons(),
                    element.electrons(), element.period()
            ));
            //todo check if Lanthanides and Actinides are considered as in a numeric group on the table
            //and update enum if so.
            if (element.metalGroup == Elements.Metal.LANTHANIDE) {
                sb.append("6,");
            } else if (element.metalGroup == Elements.Metal.ACTINIDE) {
                sb.append("7,");
            } else {
                sb.append(String.format("%d,", element.group()));
            }
            sb.append(String.format("%s,", element.phase()));
            if (element.isRadioactive()) {
                sb.append("yes");
            }
            sb.append(",");
            if (element.isNatural()) {
                sb.append("yes");
            }
            sb.append(",");
            if (element.isMetal()) {
                sb.append("yes");
            }
            sb.append(",");
            if (element.isNonMetal()) {
                sb.append("yes");
            }
            sb.append(",");
            if (element.isMetalloid()) {
                sb.append("yes");
            }
            sb.append(",");
            sb.append(String.format("%s,", element.metalGroup.metal));
            if (element.radiusVanDerWaals() > 0) {
                sb.append(element.radiusVanDerWaals());
            }
            sb.append(",");
            if (element.electronegativity() > 0) {
                sb.append(String.format("%.2f", element.electronegativity()));
            }
            sb.append(",");
            if (element.ionizationEnergy() > 0) {
                sb.append(String.format("%.4f", element.ionizationEnergy()));
            }
            sb.append(",");
            if (element.density() > 0) {
                sb.append(String.format("%f", element.density()));
            }
            sb.append(",");
            if (element.meltingPoint() > 0) {
                sb.append(String.format("%.2f", element.meltingPoint()));
            }
            sb.append(",");
            if (element.boilingPoint() > 0) {
                sb.append(String.format("%.2f", element.boilingPoint()));
            }
            sb.append(",");
            sb.append(", ,");//todo isotopes
            sb.append(String.format("%s,%s,", element.discoverer(), element.discoveryYear()));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
