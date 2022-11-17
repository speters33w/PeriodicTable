import com.ata.Elements;

public class MakeCSV {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(
                "AtomicNumber,Element,Symbol,AtomicMass,NumberOfNeutrons,NumberOfProtons,NumberOfElectrons,Period," +
                "Group,Phase,Radioactive,Natural,Metal,Nonmetal,Metalloid,Type,AtomicRadius,Electronegativity," +
                "ionizationEnergy,Density,MeltingPoint,BoilingPoint,stableIsotopes,Discoverer,Year,SpecificHeat," +
                "NumberOfShells,NumberOfValence\n");
        for (Elements element : Elements.values()) {
            sb.append(String.format("%s,%s,%s,", element.atomicNumber(), element.elementName(), element.symbol()));
            if (element.mass() >= 0) {
                StringBuilder mass = new StringBuilder(String.format("%f", element.mass()));
                while (mass.length() > 1 && mass.charAt(mass.length() - 1) == '0') {
                    mass.setLength(mass.length() - 1);
                }
                sb.append(String.format("%s,", mass));
            }
            sb.append(String.format("%d,%d,%d,%d,",
                    element.neutrons(), element.protons(), element.electrons(), element.period()));
            //todo check if Lanthanides and Actinides are considered as in a numeric group on the table
            //and update enum if so.
            if (element.metalGroup == Elements.Metal.LANTHANIDE && element.atomicNumber() >= 58) {
                sb.append(" ,");
            } else if (element.metalGroup == Elements.Metal.ACTINIDE && element.atomicNumber() >= 90) {
                sb.append(" ,");
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
                StringBuilder density = new StringBuilder(String.format("%f", element.density()));
                while (density.length() > 1 && density.charAt(density.length() - 1) == '0') {
                    density.setLength(density.length() - 1);
                }
                sb.append(density);
            }
            sb.append(",");
            if (element.meltingPoint() > 0) {
                StringBuilder meltingPoint = new StringBuilder(String.format("%.2f", element.meltingPoint()));
                while (meltingPoint.length() > 1 && meltingPoint.charAt(meltingPoint.length() - 1) == '0') {
                    meltingPoint.setLength(meltingPoint.length() - 1);
                }
                sb.append(meltingPoint);
            }
            sb.append(",");
            if (element.boilingPoint() > 0) {
                StringBuilder boilingPoint = new StringBuilder(String.format("%.2f", element.boilingPoint()));
                while (boilingPoint.length() > 1 && boilingPoint.charAt(boilingPoint.length() - 1) == '0') {
                    boilingPoint.setLength(boilingPoint.length() - 1);
                }
                sb.append(boilingPoint);
            }
            sb.append(",");
            if (element.stableIsotopes() >= 0) {
                sb.append(String.format("%d", element.stableIsotopes()));
            }
            sb.append(",");
            sb.append(String.format("%s,", element.discoverer()));
            if (!element.discoveryYearToString().equals("-1")){
                sb.append(String.format("%s,", element.discoveryYear()));
            } else sb.append(",");
            if (element.specificHeat() > 0) {
                sb.append(String.format("%.3f", element.specificHeat()));
            }
            sb.append(String.format(",%d,",element.shells()));
            if (element.valenceElectrons() >= 0) {
                sb.append(String.format("%d", element.valenceElectrons()));
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
