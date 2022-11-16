package com.ata;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.Year;

/**
 * A Java enum representing thePeriodic Table of the Elements.
 * @author StephanPeters (peterstz,speters33w)
 */
public enum Elements {
    //NAME(atomicNumber,"elementName","symbol",massF,period,group,valence,"phase","metalGroup",radiusVanDerWaals,radiusEmpirical,radiusCovalent,electronegativityF,IonizationEnergyF,density,meltingPointF,boilingPointF,specificHeatF,stableIsotopes,"discoverer",Year.of(year)),
    H(1,"Hydrogen","H",1.008F,1,1,1,"Gas","Non-Metal",120,25,32,2.2F,13.5984F,0.00008988,13.81F,20.28F,14.304F,2,"Henry Cavendish",Year.of(1766)),
    HE(2,"Helium","He",4.0026F,1,18,2,"Gas","Noble Gas",140,120,46,-1,24.5874F,0.0001785,0.95F,4.22F,5.193F,2,"Pierre Janssen - Norman Lockyer and Edward Frankland",Year.of(1868)),
    LI(3,"Lithium","Li",7F,2,1,1,"Solid","Alkali Metal",182,145,133,0.98F,5.3917F,0.534,453.65F,1615F,3.582F,2,"Johan August Arfvedson - isolated Robert Bunsen and Augustus Mathhiesen",Year.of(1817)),
    BE(4,"Beryllium","Be",9.012183F,2,2,2,"Solid","Alkaline Earth Metal",153,105,102,1.57F,9.3227F,1.85,1560F,2744F,1.825F,1,"Nicholas Louis Vauquelin - isolated Friedrich Wöhler and Antoine A. Bussy [independently]",Year.of(1797)),
    B(5,"Boron","B",10.81F,2,13,3,"Solid","Metalloid",192,85,85,2.04F,8.298F,2.37,2348F,4273F,1.026F,2,"Joseph Louis Gay-Lussac with Louis Jacques Thénard and Sir Humphrey Davy [independently]",Year.of(1808)),
    C(6,"Carbon","C",12.011F,2,14,4,"Solid","Non-Metal",170,70,75,2.55F,11.2603F,2.267,3823F,4098F,0.709F,2,"Prehistoric",Year.of(-1)),
    N(7,"Nitrogen","N",14.007F,2,15,5,"Gas","Non-Metal",155,65,71,3.04F,14.5341F,0.0012506,63.15F,77.36F,1.04F,2,"Daniel Rutherford",Year.of(1772)),
    O(8,"Oxygen","O",15.999F,2,16,6,"Gas","Non-Metal",152,60,63,3.44F,13.6181F,0.001429,54.36F,90.2F,0.918F,3,"Joseph Priestly and  Carl Wilhelm Scheele [independently]",Year.of(1774)),
    F(9,"Fluorine","F",18.99840316F,2,17,7,"Gas","Halogen",135,50,64,3.98F,17.4228F,0.001696,53.53F,85.03F,0.824F,1,"Henri Moissan",Year.of(1886)),
    NE(10,"Neon","Ne",20.18F,2,18,8,"Gas","Noble Gas",154,160,67,-1,21.5645F,0.0008999,24.56F,27.07F,1.03F,3,"Sir William Ramsay and Morris Travers",Year.of(1898)),
    NA(11,"Sodium","Na",22.9897693F,3,1,1,"Solid","Alkali Metal",227,180,155,0.93F,5.1391F,0.97,370.95F,1156F,1.228F,1,"Sir Humphrey Davy",Year.of(1807)),
    MG(12,"Magnesium","Mg",24.305F,3,2,2,"Solid","Alkaline Earth Metal",173,150,139,1.31F,7.6462F,1.74,923F,1363F,1.023F,3,"Joseph Black - isolated Sir Humphrey Davy",Year.of(1755)),
    AL(13,"Aluminum","Al",26.981538F,3,13,3,"Solid","Post-Transition Metal",184,125,126,1.61F,5.9858F,2.7,933.437F,2792F,0.897F,1,"Hans Christian Ørsted and Friedrich Wöhler",Year.of(1825)),
    SI(14,"Silicon","Si",28.085F,3,14,4,"Solid","Metalloid",210,110,116,1.9F,8.1517F,2.3296,1687F,3538F,0.705F,3,"Jöns Jakob Berzelius",Year.of(1824)),
    P(15,"Phosphorus","P",30.973762F,3,15,5,"Solid","Non-Metal",180,100,111,2.19F,10.4867F,1.82,317.3F,553.65F,0.769F,1,"Hennig Brandt",Year.of(1669)),
    S(16,"Sulfur","S",32.07F,3,16,6,"Solid","Non-Metal",180,100,103,2.58F,10.36F,2.067,388.36F,717.75F,0.71F,4,"Prehistoric",Year.of(-1)),
    CL(17,"Chlorine","Cl",35.45F,3,17,7,"Gas","Halogen",175,100,99,3.16F,12.9676F,0.003214,171.65F,239.11F,0.479F,2,"Carl Wilhelm Scheele",Year.of(1774)),
    AR(18,"Argon","Ar",39.9F,3,18,8,"Gas","Noble Gas",188,71,96,-1,15.7596F,0.0017837,83.8F,87.3F,0.52F,3,"John William Strutt (3rd Baron Rayleigh) and Sir William Ramsay",Year.of(1894)),
    K(19,"Potassium","K",39.0983F,4,1,1,"Solid","Alkali Metal",275,220,196,0.82F,4.3407F,0.89,336.53F,1032F,0.757F,2,"Sir Humphrey Davy",Year.of(1807)),
    CA(20,"Calcium","Ca",40.08F,4,2,2,"Solid","Alkaline Earth Metal",231,180,171,1F,6.1132F,1.54,1115F,1757F,0.647F,5,"Sir Humphrey Davy",Year.of(1808)),
    SC(21,"Scandium","Sc",44.95591F,4,3,2,"Solid","Transition metal",211,160,148,1.36F,6.5615F,2.99,1814F,3109F,0.568F,1,"Lars Fredrick Nilson",Year.of(1879)),
    TI(22,"Titanium","Ti",47.867F,4,4,2,"Solid","Transition metal",187,140,136,1.54F,6.8281F,4.5,1941F,3560F,0.523F,5,"William Gregor isolated Lars Fredrick Nilson",Year.of(1791)),
    V(23,"Vanadium","V",50.9415F,4,5,2,"Solid","Transition metal",179,135,134,1.63F,6.7462F,6,2183F,3680F,0.489F,1,"Andrés Manuel del Río",Year.of(1801)),
    CR(24,"Chromium","Cr",51.996F,4,6,1,"Solid","Transition metal",189,140,122,1.66F,6.7665F,7.15,2180F,2944F,0.449F,4,"Nicholas Louis Vauquelin",Year.of(1797)),
    MN(25,"Manganese","Mn",54.93804F,4,7,2,"Solid","Transition metal",197,140,119,1.55F,7.434F,7.3,1519F,2334F,0.479F,1,"Johan Gottlieb Gahn",Year.of(1774)),
    FE(26,"Iron","Fe",55.84F,4,8,2,"Solid","Transition metal",194,140,116,1.83F,7.9024F,7.874,1811F,3134F,0.449F,4,"Prehistoric",Year.of(-1)),
    CO(27,"Cobalt","Co",58.93319F,4,9,2,"Solid","Transition metal",192,135,111,1.88F,7.881F,8.86,1768F,3200F,0.421F,1,"Georg Brandt",Year.of(1735)),
    NI(28,"Nickel","Ni",58.693F,4,10,2,"Solid","Transition metal",163,135,110,1.91F,7.6398F,8.912,1728F,3186F,0.444F,5,"Baron Axel Fredrik Cronstedt",Year.of(1751)),
    CU(29,"Copper","Cu",63.55F,4,11,1,"Solid","Transition metal",140,135,112,1.9F,7.7264F,8.933,1357.77F,2835F,0.385F,2,"Prehistoric",Year.of(-1)),
    ZN(30,"Zinc","Zn",65.4F,4,12,2,"Solid","Transition metal",139,135,118,1.65F,9.3942F,7.134,692.68F,1180F,0.388F,5,"Ancient – rediscovered Andreas Sigismund Marggraf",Year.of(1746)),
    GA(31,"Gallium","Ga",69.723F,4,13,3,"Solid","Post-Transition Metal",187,130,124,1.81F,5.9993F,5.91,302.91F,2477F,0.371F,2,"Paul Émile Lecoq de Boisbaudran",Year.of(1875)),
    GE(32,"Germanium","Ge",72.63F,4,14,4,"Solid","Metalloid",211,125,121,2.01F,7.8994F,5.323,1211.4F,3106F,0.32F,4,"Clemens A. Winkler",Year.of(1886)),
    AS(33,"Arsenic","As",74.92159F,4,15,5,"Solid","Metalloid",185,115,121,2.18F,9.7886F,5.776,1090F,887F,0.329F,1,"Ancient – obtained Albertus Magnus [Albert the Great]",Year.of(1250)),
    SE(34,"Selenium","Se",78.97F,4,16,6,"Solid","Non-Metal",190,115,116,2.55F,9.7524F,4.809,493.65F,958F,0.321F,5,"Jöns Jakob Berzelius",Year.of(1817)),
    BR(35,"Bromine","Br",79.9F,4,17,7,"Liquid","Halogen",183,115,114,2.96F,11.8138F,3.11,265.95F,331.95F,0.474F,2,"Antoine J. Balard and C. Löwig [independently]",Year.of(1826)),
    KR(36,"Krypton","Kr",83.8F,4,18,8,"Gas","Noble Gas",202,-1,117,3F,13.9996F,0.003733,115.79F,119.93F,0.248F,5,"Sir William Ramsay and Morris Travers",Year.of(1898)),
    RB(37,"Rubidium","Rb",85.468F,5,1,1,"Solid","Alkali Metal",303,235,210,0.82F,4.1771F,1.53,312.46F,961F,0.363F,1,"Robert Bunsen and Gustav R. Kirchhoff",Year.of(1861)),
    SR(38,"Strontium","Sr",87.62F,5,2,2,"Solid","Alkaline Earth Metal",249,200,185,0.95F,5.6949F,2.64,1050F,1655F,0.301F,4,"Adair Crawford - isolated Sir Humphrey Davy",Year.of(1808)),
    Y(39,"Yttrium","Y",88.90584F,5,3,2,"Solid","Transition metal",219,180,163,1.22F,6.2173F,4.47,1795F,3618F,0.298F,1,"Johan Gadolin",Year.of(1794)),
    ZR(40,"Zirconium","Zr",91.22F,5,4,2,"Solid","Transition metal",186,155,154,1.33F,6.6339F,6.52,2128F,4682F,0.278F,4,"Martin Heinrich Klaproth – isolated Jöns Jakob Berzelius",Year.of(1789)),
    NB(41,"Niobium","Nb",92.90637F,5,5,1,"Solid","Transition metal",207,145,147,1.6F,6.7589F,8.57,2750F,5017F,0.265F,1,"Charles Hatchett",Year.of(1801)),
    MO(42,"Molybdenum","Mo",95.95F,5,6,1,"Solid","Transition metal",209,145,138,2.16F,7.0924F,10.2,2896F,4912F,0.251F,6,"Peter J. Hjelm",Year.of(1781)),
    TC(43,"Technetium","Tc",98,5,7,1,"Solid","Transition metal",209,135,128,1.9F,7.28F,11,2430F,4538F,-1F,0,"Carlo Perrier and Emilio Segrè",Year.of(1937)),
    RU(44,"Ruthenium","Ru",101.1F,5,8,1,"Solid","Transition metal",207,130,125,2.2F,7.3605F,12.1,2607F,4423F,0.238F,7,"Jędrzej Śniadecki -isolated Karl Klaus",Year.of(1844)),
    RH(45,"Rhodium","Rh",102.9055F,5,9,1,"Solid","Transition metal",195,135,125,2.28F,7.4589F,12.4,2237F,3968F,0.243F,1,"William Hyde Wollaston",Year.of(1803)),
    PD(46,"Palladium","Pd",106.42F,5,10,1,"Solid","Transition metal",202,140,120,2.2F,8.3369F,12,1828.05F,3236F,0.244F,6,"William Hyde Wollaston",Year.of(1803)),
    AG(47,"Silver","Ag",107.868F,5,11,2,"Solid","Transition metal",172,160,128,1.93F,7.5762F,10.501,1234.93F,2435F,0.235F,2,"Prehistoric",Year.of(-1)),
    CD(48,"Cadmium","Cd",112.41F,5,12,3,"Solid","Transition metal",158,155,136,1.69F,8.9938F,8.69,594.22F,1040F,0.232F,6,"Friedrich Strohmeyer",Year.of(1817)),
    IN(49,"Indium","In",114.818F,5,13,4,"Solid","Post-Transition Metal",193,155,142,1.78F,5.7864F,7.31,429.75F,2345F,0.233F,1,"Ferdinand Reich and Hieronymous Richter",Year.of(1863)),
    SN(50,"Tin","Sn",118.71F,5,14,5,"Solid","Post-Transition Metal",217,145,140,1.96F,7.3439F,7.287,505.08F,2875F,0.228F,10,"Prehistoric",Year.of(-1)),
    SB(51,"Antimony","Sb",121.76F,5,15,6,"Solid","Metalloid",206,145,140,2.05F,8.6084F,6.685,903.78F,1860F,0.207F,2,"Prehistoric – studied Nicolas Lémery",Year.of(1707)),
    TE(52,"Tellurium","Te",127.6F,5,16,7,"Solid","Metalloid",206,140,136,2.1F,9.0096F,6.232,722.66F,1261F,0.202F,6,"Baron Franz Joseph Müller von Reichenstein – isolated Martin-Heinrich Klaproth",Year.of(1798)),
    I(53,"Iodine","I",126.9045F,5,17,8,"Solid","Halogen",198,140,133,2.66F,10.4513F,4.93,386.85F,457.55F,0.214F,1,"Bernard Courtois",Year.of(1811)),
    XE(54,"Xenon","Xe",131.29F,5,18,1,"Gas","Noble Gas",216,-1,131,2.6F,12.1298F,0.005887,161.36F,165.03F,0.158F,7,"Sir William Ramsay and Morris Travers",Year.of(1898)),
    CS(55,"Cesium","Cs",132.905452F,6,1,2,"Solid","Alkali Metal",343,260,232,0.79F,3.8939F,1.93,301.59F,944F,0.242F,1,"Robert Bunsen and Gustav R. Kirchhoff",Year.of(1860)),
    BA(56,"Barium","Ba",137.33F,6,2,2,"Solid","Alkaline Earth Metal",268,215,196,0.89F,5.2117F,3.62,1000F,2170F,0.204F,6,"Sir Humphrey Davy",Year.of(1808)),
    LA(57,"Lanthanum","La",138.9055F,6,3,2,"Solid","Lanthanide",240,195,180,1.1F,5.5769F,6.15,1191F,3737F,0.195F,1,"Carl Gustav Mosander",Year.of(1839)),
    CE(58,"Cerium","Ce",140.116F,6,-1,2,"Solid","Lanthanide",235,185,163,1.12F,5.5387F,6.77,1071F,3697F,0.192F,4,"Jöns Jakob Berzelius and Wilhelm von Hisinger - isolated William F. Hillebrand and Thomas H. Norton",Year.of(1803)),
    PR(59,"Praseodymium","Pr",140.90766F,6,-1,2,"Solid","Lanthanide",239,185,176,1.13F,5.473F,6.77,1204F,3793F,0.193F,1,"Baron Carl Auer von Welsbach",Year.of(1885)),
    ND(60,"Neodymium","Nd",144.24F,6,-1,2,"Solid","Lanthanide",229,185,174,1.14F,5.525F,7.01,1294F,3347F,0.19F,5,"Baron Carl Auer von Welsbach",Year.of(1885)),
    PM(61,"Promethium","Pm",144.91276F,6,-1,2,"Solid","Lanthanide",236,185,173,1.13F,5.582F,7.26,1315F,3273F,-1F,0,"Jacob A. Marinsky and Lawrence E. Glendenin and Charles D. Coryell",Year.of(1945)),
    SM(62,"Samarium","Sm",150.4F,6,-1,2,"Solid","Lanthanide",229,185,172,1.17F,5.6437F,7.52,1347F,2067F,0.197F,5,"Paul Émile Lecoq de Boisbaudran",Year.of(1879)),
    EU(63,"Europium","Eu",151.964F,6,-1,2,"Solid","Lanthanide",233,185,168,1.2F,5.6704F,5.24,1095F,1802F,0.182F,1,"Eugène-Antole Demarçay",Year.of(1901)),
    GD(64,"Gadolinium","Gd",157.2F,6,-1,2,"Solid","Lanthanide",237,180,169,1.2F,6.1501F,7.9,1586F,3546F,0.236F,6,"Jean Charles Galissard de Marignac",Year.of(1880)),
    TB(65,"Terbium","Tb",158.92535F,6,-1,2,"Solid","Lanthanide",221,175,168,1.2F,5.8638F,8.23,1629F,3503F,0.182F,1,"Carl Gustaf Mosander",Year.of(1843)),
    DY(66,"Dysprosium","Dy",162.5F,6,-1,2,"Solid","Lanthanide",229,175,167,1.22F,5.9389F,8.55,1685F,2840F,0.17F,7,"Paul Émile Lecoq de Boisbaudran",Year.of(1886)),
    HO(67,"Holmium","Ho",164.93033F,6,-1,2,"Solid","Lanthanide",216,175,166,1.23F,6.0215F,8.8,1747F,2973F,0.165F,1,"Marc Delafontaine with Jacques-Louis Soret and Per Teodor Cleve",Year.of(1878)),
    ER(68,"Erbium","Er",167.26F,6,-1,2,"Solid","Lanthanide",235,175,165,1.24F,6.1077F,9.07,1802F,3141F,0.168F,6,"Carl Gustaf Mosander",Year.of(1843)),
    TM(69,"Thulium","Tm",168.93422F,6,-1,2,"Solid","Lanthanide",227,175,164,1.25F,6.1843F,9.32,1818F,2223F,0.16F,1,"Per Teodor Cleve",Year.of(1879)),
    YB(70,"Ytterbium","Yb",173.05F,6,-1,2,"Solid","Lanthanide",242,175,170,1.1F,6.2542F,6.9,1092F,1469F,0.155F,7,"Jean Charles Galissard de Marignac",Year.of(1878)),
    LU(71,"Lutetium","Lu",174.9668F,6,3,2,"Solid","Lanthanide",221,175,162,1.27F,5.4259F,9.84,1936F,3675F,0.154F,1,"Georges Urbain and Charles James [independently]",Year.of(1907)),
    HF(72,"Hafnium","Hf",178.49F,6,4,2,"Solid","Transition metal",212,155,152,1.3F,6.8251F,13.3,2506F,4876F,0.144F,5,"Dirk Coster and Georg von Hevesey",Year.of(1923)),
    TA(73,"Tantalum","Ta",180.9479F,6,5,2,"Solid","Transition metal",217,145,146,1.5F,7.5496F,16.4,3290F,5731F,0.14F,2,"Anders Gustaf Ekenberg",Year.of(1802)),
    W(74,"Tungsten","W",183.84F,6,6,2,"Solid","Transition metal",210,135,137,2.36F,7.864F,19.3,3695F,5828F,0.132F,4,"José and Fausto Elhuijar",Year.of(1783)),
    RE(75,"Rhenium","Re",186.207F,6,7,2,"Solid","Transition metal",217,135,131,1.9F,7.8335F,20.8,3459F,5869F,0.137F,1,"Walter Noddack and Ida Tacke and and Otto Berg",Year.of(1925)),
    OS(76,"Osmium","Os",190.2F,6,8,2,"Solid","Transition metal",216,130,129,2.2F,8.4382F,22.57,3306F,5285F,0.13F,6,"Smithson Tennant and William Hyde Wollaston",Year.of(1803)),
    IR(77,"Iridium","Ir",192.22F,6,9,1,"Solid","Transition metal",202,135,122,2.2F,8.967F,22.42,2719F,4701F,0.131F,2,"Smithson Tennant",Year.of(1803)),
    PT(78,"Platinum","Pt",195.08F,6,10,1,"Solid","Transition metal",209,135,123,2.28F,8.9587F,21.46,2041.55F,4098F,0.133F,5,"Prehistoric pre-Columbian South Americans - Don Antonio de Ulloa",Year.of(1735)),
    AU(79,"Gold","Au",196.96657F,6,11,2,"Solid","Transition metal",166,135,124,2.54F,9.2255F,19.282,1337.33F,3129F,0.129F,1,"Prehistoric",Year.of(-1)),
    HG(80,"Mercury","Hg",200.59F,6,12,3,"Liquid","Transition metal",209,150,133,2F,10.4375F,13.5336,234.32F,629.88F,0.14F,7,"Prehistoric",Year.of(-1)),
    TL(81,"Thallium","Tl",204.383F,6,13,4,"Solid","Post-Transition Metal",196,190,144,1.62F,6.1082F,11.8,577F,1746F,0.129F,2,"William Crookes",Year.of(1861)),
    PB(82,"Lead","Pb",207F,6,14,5,"Solid","Post-Transition Metal",202,180,144,2.33F,7.4167F,11.342,600.61F,2022F,0.129F,4,"Prehistoric",Year.of(-1)),
    BI(83,"Bismuth","Bi",208.9804F,6,15,6,"Solid","Post-Transition Metal",207,160,151,2.02F,7.2856F,9.807,544.55F,1837F,0.122F,0,"Ancient – isolated Claude-Francois Geoffroy",Year.of(1753)),
    PO(84,"Polonium","Po",209,6,16,7,"Solid","Metalloid",197,190,145,2F,8.417F,9.32,527F,1235F,-1F,0,"Marie Curie",Year.of(1898)),
    AT(85,"Astatine","At",209.98715F,6,17,8,"Solid","Halogen",202,215,147,2.2F,9.3F,7,575F,503F,-1,0,"Dale R. Corson and K. R. MacKenzie and Emilio Segrè",Year.of(1940)),
    RN(86,"Radon","Rn",222.01758F,6,18,1,"Gas","Noble Gas",220,-1,142,2.2F,10.7485F,0.00973,202F,211.45F,0.094F,0,"Friederich Ernst Dorn",Year.of(1900)),
    FR(87,"Francium","Fr",223.01973F,7,1,2,"Solid","Alkali Metal",348,-1,-1,0.7F,4.0727F,-1,300F,890F,-1,0,"Marguerite Perey",Year.of(1939)),
    RA(88,"Radium","Ra",226.02541F,7,2,2,"Solid","Alkaline Earth Metal",283,-1,201,0.9F,5.2784F,5.5,973F,1413F,-1,0,"Pierre and Marie Curie",Year.of(1898)),
    AC(89,"Actinium","Ac",227.02775F,7,3,2,"Solid","Actinide",260,195,186,1.1F,5.17F,10.07,1324F,3471F,0.12F,0,"André-Louis Debierne",Year.of(1899)),
    TH(90,"Thorium","Th",232.038F,7,-1,2,"Solid","Actinide",237,180,175,1.3F,6.3067F,11.72,2023F,5061F,0.113F,0,"Jöns Jakob Berzelius",Year.of(1828)),
    PA(91,"Protactinium","Pa",231.03588F,7,-1,2,"Solid","Actinide",243,180,169,1.5F,5.89F,15.37,1845F,4300F,-1,0,"Otto Hahn with Lise Meitner - Kasimir Fajans with O. H. Göhring - Frederick Soddy with John Cranston with Alexander Fleck [independently] – isolated Aristid V. Grosse",Year.of(1934)),
    U(92,"Uranium","U",238.0289F,7,-1,2,"Solid","Actinide",240,175,170,1.38F,6.1941F,18.95,1408F,4404F,0.116F,0,"Martin-Heinrich Klaproth – isolated Eugène-Melchior Peligot",Year.of(1841)),
    NP(93,"Neptunium","Np",237.048172F,7,-1,2,"Solid","Actinide",221,175,171,1.36F,6.2657F,20.25,917F,4175F,-1,0,"Edwin M. McMillan and Philip H. Abelson",Year.of(1940)),
    PU(94,"Plutonium","Pu",244.0642F,7,-1,2,"Solid","Actinide",243,175,172,1.28F,6.0262F,19.84,913F,3501F,-1,0,"Glenn T. Seaborg and Arthur C. Wahl and Joseph W. Kennedy",Year.of(1940)),
    AM(95,"Americium","Am",243.06138F,7,-1,2,"Solid","Actinide",244,175,166,1.3F,5.9738F,13.69,1449F,2284F,-1,0,"Glenn T. Seaborg and Ralph A. James and Leon O. Morgan and Albert Ghiorso",Year.of(1944)),
    CM(96,"Curium","Cm",247.07035F,7,-1,2,"Solid","Actinide",245,176,166,1.3F,5.9915F,13.51,1618F,3400F,-1,0,"Glenn T. Seaborg and Ralph A. James and and Albert Ghiorso",Year.of(1944)),
    BK(97,"Berkelium","Bk",247.07031F,7,-1,2,"Solid","Actinide",244,-1,-1,1.3F,6.1979F,14,1323F,2900,-1,0,"Stanley G. Thompson and Albert Ghiorso and and Glenn T. Seaborg",Year.of(1949)),
    CF(98,"Californium","Cf",251.07959F,7,-1,2,"Solid","Actinide",245,-1,-1,1.3F,6.2817F,15.1,1173F,1743,-1,0,"Stanley G. Thompson and Kenneth Street and Jr. and Albert Ghiorso and and Glenn T. Seaborg",Year.of(1950)),
    ES(99,"Einsteinium","Es",252.083F,7,-1,2,"Solid","Actinide",245,-1,-1,1.3F,6.42F,8.84,1133F,1269,-1,0,"Gregory R. Choppin and Stanley G. Thompson and Albert Ghiorso and and Bernard G. Harvey",Year.of(1952)),
    FM(100,"Fermium","Fm",257.09511F,7,-1,2,"Solid","Actinide",-1,-1,-1,1.3F,6.5F,9.97,1800F,-1,-1,0,"Gregory R. Choppin and Stanley G. Thompson and Albert Ghiorso and and Bernard G. Harvey",Year.of(1952)),
    MD(101,"Mendelevium","Md",258.09843F,7,-1,2,"Solid","Actinide",-1,194,-1,1.3F,6.58F,10.3,1100F,-1,-1,0,"Albert Ghiorso and Bernard G. Harvey and Greogory R. Chopin and Stanley G. Thompson and and Glenn T. Seaborg",Year.of(1955)),
    NO(102,"Nobelium","No",259.101F,7,-1,3,"Solid","Actinide",-1,197,-1,1.3F,6.65F,9.9,1100F,-1,-1,0,"Albert Ghiorso and Torbjorn Sikkeland and John R. Walton and and Glenn T. Seaborg",Year.of(1958)),
    LR(103,"Lawrencium","Lr",266.12F,7,3,2,"Solid","Actinide",-1,171,-1,1.3F,-1,14.4,1900F,-1,-1,0,"Albert Ghiorso and Torbjorn Sikkeland and Almon Larsh and and Robert M. Latimer",Year.of(1961)),
    RF(104,"Rutherfordium","Rf",267.122F,7,4,2,"Solid","Transition metal",-1,157,-1,-1,-1,17,2400F,5800F,-1,0,"Researchers at the JINR and Albert Ghiorso et. al.",Year.of(1964)),
    DB(105,"Dubnium","Db",268.126F,7,5,2,"Solid","Transition metal",-1,149,-1,-1,-1,21.6,-1,-1,-1,0,"Researchers at the JINR and Albert Ghiorso et. al.",Year.of(1967)),
    SG(106,"Seaborgium","Sg",269.128F,7,6,2,"Solid","Transition metal",-1,132,143,-1,-1,23.5,-1,-1,-1,0,"Albert Ghiorso et. al.",Year.of(1974)),
    BH(107,"Bohrium","Bh",270.133F,7,7,2,"Solid","Transition metal",-1,128,141,-1,-1,26.5,-1,-1,-1,0,"Peter Armbruster and Gottfried Münzenberg et. al.",Year.of(1981)),
    HS(108,"Hassium","Hs",269.1336F,7,8,-1,"Solid","Transition metal",-1,126,134,-1,-1,28,-1,-1,-1,0,"Peter Armbruster and Gottfried Münzenberg et. al.",Year.of(1984)),
    MT(109,"Meitnerium","Mt",277.154F,7,9,-1,"Solid","Transition metal",-1,128,129,-1,-1,27.5,-1,-1,-1,0,"Peter Armbruster and Gottfried Münzenberg et. al.",Year.of(1982)),
    DS (110,"Darmstadtium","Ds",282.166F,7,10,-1,"Solid (Expected)","Transition metal",-1,132,128,-1,-1,26.5,-1,-1,-1,0,"Jorge Rigol et. al.",Year.of(1994)),
    RG (111,"Roentgenium","Rg",282.169F,7,11,-1,"Solid (Expected)","Transition metal",-1,138,121,-1,-1,22.5,-1,-1,-1,0,"Peter Armbruster and Gottfried Münzenberg et. al.",Year.of(1994)),
    CN (112,"Copernicium","Cn",286.179F,7,12,-1,"Solid (Expected)","Transition metal",-1,-1,-1,-1,-1,23.7,-1,-1,-1,0,"Peter Armbruster and Gottfried Münzenberg et. al.",Year.of(1996)),
    NH(113,"Nihonium","Nh",286.182F,7,13,-1,"Solid (Expected)","Post-Transition Metal",-1,-1,-1,-1,-1,11.85,-1,-1,-1,0,"RIKEN Nishina Center for Accelerator-based Science",Year.of(2004)),
    FL(114,"Flerovium","Fl",290.192F,7,14,-1,"Solid (Expected)","Post-Transition Metal",-1,-1,-1,-1,-1,9.928,-1,-1,-1,0,"Joint Institute for Nuclear Research",Year.of(1998)),
    MC(115,"Moscovium","Mc",290.196F,7,15,-1,"Solid (Expected)","Post-Transition Metal",-1,-1,-1,-1,-1,13.5,-1,-1,-1,0,"Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory and Oak Ridge National Laboratory",Year.of(2003)),
    LV(116,"Livermorium","Lv",293.205F,7,16,-1,"Solid (Expected)","Post-Transition Metal",-1,-1,-1,-1,-1,12.9,-1,-1,-1,0,"Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory",Year.of(2000)),
    TS(117,"Tennessine","Ts",294.211F,7,17,-1,"Solid (Expected)","Halogen",-1,-1,-1,-1,-1,7.2,-1,-1,-1,0,"Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory and Oak Ridge National Laboratory",Year.of(2010)),
    OG(118,"Oganesson","Og",295.216F,7,18,-1,"Gas (Expected)","Noble Gas",-1,-1,-1,-1,-1,7.2,-1,-1,-1,0,"Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory",Year.of(2006));     public final Metal metalGroup;
    private final int atomicNumber;
    private final String elementName;
    private final String symbol;
    private final float mass;
    private final int period;
    private final int group;
    private final int valence;
    private final Phase phase;
    private final int radiusVanDerWaals;
    private final int radiusEmpirical;
    private final int radiusCovalent;
    private final float electronegativity;
    private final float ionizationEnergy;
    private final double density;
    private final float meltingPoint;
    private final float boilingPoint;
    private final float specificHeat;
    private final int stableIsotopes;
    private final String discoverer;
    private final Year discoveryYear;
    private final DecimalFormat threePlaces = new DecimalFormat("0.000");

    Elements(int atomicNumber, String elementName, String symbol, float mass,
             int period, int group, int valence, String phaseName, String metalGroup, int radiusVanDerWaals, int radiusEmpirical,
             int radiusCovalent, float electronegativity, float ionizationEnergy, double density, float meltingPoint,
             float boilingPoint, float specificHeat, int stableIsotopes, String discoverer, Year discoveryYear) {
        this.atomicNumber = atomicNumber;
        this.elementName = elementName;
        this.symbol = symbol;
        this.mass = mass;
        this.period = period;
        this.group = group;
        this.valence = valence;
        this.phase = Phase.getPhase(phaseName);
        this.metalGroup = Metal.getMetal(metalGroup);
        this.radiusVanDerWaals = radiusVanDerWaals;
        this.radiusEmpirical = radiusEmpirical;
        this.radiusCovalent = radiusCovalent;
        this.electronegativity = electronegativity;
        this.ionizationEnergy = ionizationEnergy;
        this.density = density;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.specificHeat = specificHeat;
        this.stableIsotopes = stableIsotopes;
        this.discoverer = toUtf8(discoverer);
        this.discoveryYear = discoveryYear;
    }

    /**
     * Returns the atomic number of an element.
     * Example:
     * {@code Elements.BR.atomicNumber()}
     * will return {@code 35}.
     * @return the atomic number of the element.
     */
    public int atomicNumber() {
        return atomicNumber;
    }

    /**
     * Returns the name of an element.
     * Example:
     * {@code Elements.BR.elementName()}
     * will return {@code "Bromine"}.
     * @return the name of the element.
     */
    public String elementName() {
        return elementName;
    }

    /**
     * Returns the symbol of an element.
     * Example:
     * {@code Elements.BR.symbol()}
     * will return {@code "Br"}.
     * @return the symbol of the element.
     */
    public String symbol() {
        return symbol;
    }

    /**
     * Returns the Atomic Weight of an element in atomic mass units (amu).
     * Example:
     * {@code Elements.BR.mass()}
     * will return {@code 79.904}.<br>
     * Data from
     * <a href="https://pubchem.ncbi.nlm.nih.gov/periodic-table/">The National Center for Biotechnology Information</a>
     * @return the Atomic Weight of an element in atomic mass units (amu).
     */
    public double mass() {
        return mass;
    }

    /**
     * Returns the periodic table period (rows 1-7).
     * Example:
     * {@code Elements.BR.period()}
     * will return {@code 4}.
     * @return the period of the element.
     */
    public int period() {
        return period;
    }

    /**
     * Returns the periodic table group (column 1 - 18).
     * Example:
     * {@code Elements.BR.group()}
     * will return {@code 17}.
     * @return the group of the element.
     */
    public int group() {
        return group;
    }

    /**
     * <p>Returns the periodic table group in CAS Roman numeral format,
     * (IA, IIA, IIIB, IVB, VB, etc.).
     * Example:<pre>
     * {@code Elements.BR.groupCAS()}</pre>
     * will return {@code VIIA}.</p><br><p>
     * @return the group of the element in CAS Roman Numeral format.
     */
    public String groupCAS() {
        return groupToCAS(group);
    }

    /**
     * <p>Returns the periodic table group in old IUPAC Roman numeral format,
     * (IA, IIA, IIIA, IVA, VA, etc.).
     * Example:<pre>
     * {@code Elements.BR.groupOldIUPAC()}</pre>
     * will return {@code VIIB}.</p><br><p>
     * @return the group of the element in old IUPAC Roman Numeral format.
     */
    public String groupOldIUPAC() {
        return groupToOldIUPAC(group);
    }

    public enum Phase {
        SOLID("Solid"),
        LIQUID("Liquid"),
        GAS("Gas"),
        SOLID_EXPECTED("Solid (Expected)"),
        LIQUID_EXPECTED("Liquid (Expected)"),
        GAS_EXPECTED("Gas (Expected)"),
        UNKNOWN("Unknown");
        private final String phaseName;
        Phase(String phaseName) {
            this.phaseName = phaseName;
        }
        private static Phase getPhase (String phaseName) {
            for(Phase phase : Phase.values()) {
                if(phase.phaseName.equals(phaseName)) return phase;
            }
            return Phase.UNKNOWN;
        }
    }

    /**
     * Returns the phase of the element (solid, liquid, gas, artificial).
     * Example:
     * {@code Elements.BR.phase()}
     * will return {@code "liquid"}.
     * @return the phase of the element.
     */
    public String phase() {
        return phase.phaseName;
    }

    /**
     * Returns the periodic table block of the element (s,p,d,f).
     * Example:
     * {@code Elements.BR.block()}
     * will return {@code 'p'}.
     * @return the periodic table block of the element.
     */
    public char block(){
        if (symbol.equals("La")) return 'f';
        return getBlock(group);
    }

    /**
     * Returns the metal group of the element (Alkali Metal, Alkaline Earth Metal, Transition Metal, etc.).
     * Example:
     * {@code Elements.BR.metalGroup()}
     * will return {@code "Halogen"}.
     * @return the metal group of the element.
     */
    public String metalGroup() {
        return metalGroup.metal;
    }

    public enum Metal {
        ALKALI("Alkali Metal"),
        ALKALINE_EARTH("Alkaline Earth Metal"),
        TRANSITION("Transition Metal"),
        POST_TRANSITION("Post-Transition Metal"),
        METAL("Metal"),
        METALLOID("Metalloid"),
        NON_METAL("Non-Metal"),
        HALOGEN("Halogen"),
        NOBLE_GAS("Noble Gas"),
        LANTHANIDE("Lanthanide"),
        ACTINIDE("Actinide"),
        TRANSACTINIDE("Transactinide"),
        UNKNOWN("Unknown");

        public final String metal;
        Metal(String metalType) {
            this.metal = metalType;
        }
        static Metal getMetal(String metalType) {
            for(Metal metal : Metal.values()) {
                if(metal.metal.equalsIgnoreCase(metalType)) return metal;
            }
            return Metal.UNKNOWN;
        }
    }

    /**
     * Returns the number of protons in an element's atom.
     * Example:
     * {@code Elements.BR.protons()}
     * will return {@code 35}.
     * @return the number of protons of the element.
     */
    public int protons() {
        return atomicNumber;
    }

    /**
     * Returns the number of neutrons in an element's atom.
     * Example:
     * {@code Elements.BR.neutrons()}
     * will return {@code 45}.
     * @return the number of neutrons of the element.
     */
    public int neutrons() {
        return Math.round(mass) - atomicNumber;
    }

    //todo add electron configuration
    /**
     * Returns the number of electrons in an element's atom.
     * Example:
     * {@code Elements.BR.electrons()}
     * will return {@code 35}.
     * @return the number of electrons of the element.
     */
    public int electrons() {
        return atomicNumber;
    }

    /**
     * Returns the van der Waals atomic radius of the element in picometers (pm).
     * Example:
     * {@code Elements.BR.radiusVanDerWaals()}
     * will return {@code 185}.<br>
     * Data from <a href="https://periodic.lanl.gov/index.shtml">Los Alamos National Laboratory</a>.
     * @return the van der Waals atomic radius of the element in picometers (pm).
     */
    public int radiusVanDerWaals() {
        return radiusVanDerWaals;
    }

    /**
     * Returns the Empirical atomic radius of the element in picometers (pm).
     * Example:
     * {@code Elements.BR.radiusEmpirical()}
     * will return {@code 115}.<br><br>
     * Most data from <br><em>Radii in Crystals</em>.<br>
     * The Journal of Chemical Physics. 41 (10): 3199–3204. <br>
     * Bibcode:1964JChPh..41.3199S. doi:10.1063/1.1725697.<br><br>
     * Most predictive values from <br>Hoffman, Darleane C.; Lee, Diana M.; Pershina, Valeria (2006).
     * <em>Transactinides and the future elements".</em><br>
     * In Morss; Edelstein, Norman M.; Fuger, Jean (eds.).<br>
     * <em>The Chemistry of the Actinide and Transactinide Elements (3rd ed.).</em><br>
     * Dordrecht, The Netherlands: Springer Science+Business Media.<br>
     * ISBN 978-1-4020-3555-5.
     * @return the empirical atomic radius of the element in picometers (pm).
     */
    public int radiusEmpirical() {
        return radiusEmpirical;
    }

    /**
     * Returns the Covalent (single bond) atomic radius of the element in picometers (pm).
     * Example:
     * {@code Elements.BR.radiusCovalent()}
     * will return {@code 114}.<br>
     * Most predictive values from the<a href="https://www.rsc.org/periodic-table">Royal Society of Chemistry</a>.
     * @return the Covalent (single bond) atomic radius of the element in picometers (pm).
     */
    public int radiusCovalent() {
        return radiusCovalent;
    }

    /**
     * Returns the electronegativity of an element in Pauling units.
     * Example:
     * {@code Elements.BR.electronegativity()}
     * will return {@code 2.96}.
     * @return the electronegativity of an element in Pauling units.
     */
    public double electronegativity() {
        return electronegativity;
    }

    /**
     * Returns the ionization energy of an element in electron-volts (eV).
     * Example:
     * {@code Elements.BR.ionizationEnergy()}
     * will return {@code 11.8138}.
     * @return the ionization energy of an element in electron-volts (eV).
     */
    public double ionizationEnergy() {
        return ionizationEnergy;
    }

    /**
     * Returns the density of an element in g/cm³.
     * Example:
     * {@code Elements.BR.density()}
     * will return {@code 3.12}.
     * @return the density of an element in g/cm³.
     */
    public double density() {
        return density;
    }

    /**
     * Returns the melting point of an element in degrees Kelvin.
     * Example:
     * {@code Elements.BR.meltingPoint()}
     * will return {@code 266.05}.
     * @return the melting point of an element (°K).
     */
    public double meltingPoint() {
        return meltingPoint;
    }

    /**
     * Returns the boiling point of an element in degrees Kelvin.
     * Example:
     * {@code Elements.BR.boilingPoint()}
     * will return {@code 332.0}.
     * @return the melting point of an element (°K).
     */
    public double boilingPoint() {
        return boilingPoint;
    }

    /**
     * Returns the specific heat of an element in Joules per gram Celsius J/(g·C)
     * (identical to Joules per gram Kelvin J/(g·K))
     * at 25 degrees C (298 K)
     * Example:
     * {@code Elements.BR.specificHeat()}
     * will return {@code 0.474}.
     * @return the specific heat of an element (J/(g·C)).
     */
    public double specificHeat() {
        return specificHeat;
    }

    /**
     * Returns the number of electron shells of the element.
     * Example:
     * {@code Elements.BR.electronShells()}
     * will return {@code 4}.
     * @return the number of electron shells of the element.
     */
    public int shells() {
        return period;
    }

    //todo use a calculation based on electron configuration and remove data values from enum
    /**
     * Returns the number of valence electrons of the element.
     * Example:
     * {@code Elements.BR.valenceElectrons()}
     * will return {@code 7}.
     * @return the number of valence electrons of the element.
     */
    public int valenceElectrons() {
        return valence;
    }

    /**
     * Returns the number of stable isotopes of the element.
     * By convention, nuclides are counted as "stable"
     * if they have never been observed to decay by experiment
     * or from observation of decay products.
     * @return the number of stable isotopes of the element.
     */
    public int stableIsotopes() {
        return stableIsotopes;
    }

    /**
     * Returns the accepted discoverer(s) of the element.
     * Example:
     * {@code Elements.BR.discoverer()}
     * will return {@code "Balard"}.
     * @return the accepted discoverer(s) of the element.
     */
    public String discoverer() {
        return discoverer;
    }

    /**
     * Returns the accepted discovery Year of the element.
     * Example:
     * {@code Elements.BR.discoveryYear()}
     * will return {@code "java.time.Year.of(1826)"}.
     * @return the accepted discovery Year of the element.
     */
    public Year discoveryYear() {
        return discoveryYear;
    }

    /**
     * Returns the accepted discovery year of the element.
     * Example:
     * {@code Elements.BR.discoveryYearToString()}
     * will return {@code "1826"}.
     * @return the accepted discovery year of the element.
     */
    public String discoveryYearToString() {
        return discoveryYear.toString();
    }

    //todo implement percent of earth's crust field and use that for calculation.
    /**
     * Returns true if the element is natural.
     * Example:
     * {@code Elements.BR.isNatural()}
     * will return {@code true}.
     * @return true if the element is natural.
     */
    public boolean isNatural() {
        if (elementName.equals("Francium") || elementName.equals("Astatine")){
            return true;
            // will return false for Technetium and Promethium, there may be argument for
            // these elements as naturally occurring from decay.
        } else return discoveryYear.isBefore(Year.of(1937));
    }

    /**
     * Returns true if the element is radioactive.
     * Example:
     * {@code Elements.BR.isRadioactive()}
     * will return {@code false}.
     * @return true if the element is radioactive.
     */
    public boolean isRadioactive() {
        if (atomicNumber >= 84) {
            return true;
        } else {
            return !isNatural();
        }
    }

    /**
     * Returns true if the element is metal.
     * Example:
     * {@code Elements.BR.isMetal()}
     * will return {@code false}.
     * @return true if the element is metal.
     */
    public boolean isMetal() {
        //identifies "Transition Metal"
        if (metalGroup.metal.toLowerCase().contains("tr")) {
            return true;
        } else return !metalGroup.metal.toLowerCase().contains("o");
    }

    /**
     * Returns true if the element is non-metal.
     * Example:
     * {@code Elements.BR.isNonMetal()}
     * will return {@code true}.
     * @return true if the element is non-metal.
     */
    public boolean isNonMetal() {
        return !isMetal() && !isMetalloid();
    }

    /**
     * Returns true if the element is metalloid.
     * Example:
     * {@code Elements.BR.isMetalloid()}
     * will return {@code false}.
     * @return true if the element is metalloid.
     */
    public boolean isMetalloid() {
        if (period <= 6) {
            if (group - period == 10 || group - period == 11) {
                return !elementName.equals("Aluminum") && !elementName.equals("Astatine");
            }
        }
        return false;
    }

    /**
     * Returns an Elements element based on a sloppy case-insensitive search
     * by symbol or by first three or four characters in an element's name.
     * Examples:
     * {@code Elements.getElement(brom);}
     * will return {@code Elements.BR}.
     * {@code Elements.getElement(BR);}
     * will return {@code Elements.BR}.
     * At least four character are recommended for a name search, but not always required.
     * For example, {@code Elements.getElement(Ber);} will return the first matching element in the table,
     * Beryllium, even though the desired element could be Berkelium.
     * {@code Elements.getElement(bro);} will return {@code Elements.BR},
     * because Bromine can not be easily confused with another element from the first three characters.
     * @param query the search query by symbol or start of the name.
     * @return the Elements element.
     */
    public static Elements getElement(String query) {
        if (query.length() == 0) return null;
        if (query.length() <= 2) {
            for (Elements elements : Elements.values()) {
                if (query.equalsIgnoreCase(elements.symbol)) return elements;
            }
            return null;
        }
//        if (queryCheck(query)) {
            if (query.toLowerCase().startsWith("ruther")) return Elements.RF;
            if (query.toLowerCase().startsWith("hydra")) return Elements.HG;
            if (query.toLowerCase().startsWith("ununb")) return Elements.CN;
            if (query.toLowerCase().startsWith("ununq")) return Elements.FL;
            query = disambiguation(query);
            for (Elements elements : Elements.values()) {
                if (elements.elementName().toLowerCase().startsWith(query.toLowerCase())) {
                    return elements;
                }
            }
//        }
        return null;
    }

    /**
     * Returns false if a queried element may be ambiguous.
     * @param query the 3 or 4 character long search query.
     * @return false if a queried element may be ambiguous.
     */
    private static boolean queryCheck(String query){
        if (query.length() == 3) {
            return switch (query.toLowerCase()) {
                case "ber", "cal", "cop", "hyd", "neo", "pro", "rad", "rut", "sil", "unu", "ytt" -> false;
                default -> true;
            };
        }
        if (query.length() == 4) {
            return switch (query.toLowerCase()) {
                case "ruth", "hydr", "unun" -> false;
                default -> true;
            };
        }
        return query.length() != 5 || !query.toLowerCase().startsWith("ruthe");
    }


    /**
     * Returns standard element names for alternate element names, used with getElement() search query.
     * @param query the query string.
     * @return the standard element names.
     */
    public static String disambiguation(String query) {
        if (query.length() >= 4) {
            return switch (query.substring(0, 4).toLowerCase()) {
                case "arge" -> "Silver";
                case "aurg" -> "Gold";
                case "caes", "cæsi" -> "Cesium";
                case "colu" -> "Niobium";
                case "cupr" -> "Copper";
                case "ferr" -> "Iron";
                // case "hydr" -> "Mercury"; // conflicts with "Hydrogen"
                case "kali" -> "Potassium";
                case "natr" -> "Sodium";
                case "plum" -> "Lead";
                case "stan" -> "Tin";
                case "stib" -> "Antimony";
                case "sulp" -> "Sulfur";
                case "wolf" -> "Tungsten";
                default -> query;
            };
        }
        return query;
    }

    @Override
    public String toString() {
        return String.format("[%14s- Atomic Number: %3d, Element: %2s, Atomic Weight (amu): %-7s ]",
                elementName, atomicNumber, symbol, threePlaces.format(mass));
    }

    //todo finish deepToString method.
    public String deepToString(){
        StringBuilder elementDeepToString = new StringBuilder();
        elementDeepToString.append
                (String.format("%s%n%nAtomic Number: %d%nElement: %s%nElement Name: %s%nAtomic Weight (amu): %s%n",
                elementName.toUpperCase(), atomicNumber, symbol, elementName, threePlaces.format(mass)));
        elementDeepToString.append
                (String.format("Standard State: %s%n",
                 phase.phaseName));

        return elementDeepToString.toString();
    }

    //////////  /* STATIC UTILITY METHODS */ //////////

    /**
     * Converts Kelvin to Celsius.
     * @param k temperature in degrees Celsius.
     * @return temperature in degrees Celsius.
     */
    public static double kelvinToCelsius(double k){
        if(k == -1) {
            return k;
        } else {
            return k - 273.15F;
        }
    }

    /**
     * Converts Kelvin to Fahrenheit.
     * @param k temperature in degrees Kelvin.
     * @return temperature in degrees Fahrenheit.
     */
    public static double kelvinToFahrenheit(double k){
        if (k == -1) {
            return k;
        } else {
            return (k - 273.15F) * 1.8F + 32;
        }
    }

    /**
     * Converts J/(g·C) to J/(kg·K) for specific heat.
     * @param joulesPerGramCelsius J/(g·C)
     * @return J/(kg·K)
     */
    public static double JoulesPerGramCToJoulesPerKilogramK (double joulesPerGramCelsius){
        return joulesPerGramCelsius * 1000;
    }

    /**
     * Converts J/(kg·K) to J/(g·C) for specific heat.
     * @param joulesPerKilogramKelvin J/(kg·K)
     * @return J/(g·C)
     */
    public static double JoulesPerKilogramKToJoulesPerGramC (double joulesPerKilogramKelvin){
        return joulesPerKilogramKelvin * .001;
    }

    /**
     * Makes a string UTF-8 encoded.
     * @param string The string to be encoded.
     * @return The encoded string.
     */
    public static String toUtf8(String string) {
        ByteBuffer buffer = StandardCharsets.UTF_8.encode(string);
        return StandardCharsets.UTF_8.decode(buffer).toString();
    }

    /**
     * Returns the periodic table block of the element.
     * Returns an incorrect block for Lanthanum, use Elements.block(int group, int period) instead.
     * @param group the periodic table group of the element using the IUPAC numbering system (1-18).
     * @return the periodic table block of the element.
     */
    char getBlock(int group){
        if (group == -1) {
            return 'f';
        }
        if (group >= 13) {
            return 'p';
        } else if (group >= 3){
            return 'd';
        }
        return 's';
    }

    /**
     * Returns the periodic table block of the element.
     * @param group the periodic table group of the element using the IUPAC numbering system (1-18).
     * @param period the periodic table period of the element
     * @return the periodic table block of the element.
     */
    public char getBlock(int group, int period){
        if (group == -1 || (group == 3 && period == 6)) {
            return 'f';
        }
        if (group >= 13) {
            return 'p';
        } else if (group >= 3){
            return 'd';
        }
        return 's';
    }

    /**
     * <p></p>Returns the periodic table group in Mendeleev format,
     * (I, II, III, IV, V, etc.).
     * Example:<pre>
     * {@code groupToMendeleev(Elements.BR.group())}</pre>
     * will return {@code VII}.</p><p>
     * @param group the integer using the IUPAC numbering system (1-18) group of the element.
     * @return the element group in Mendeleev Roman numeral format.
     */
    public static String groupToMendeleev(int group){
        StringBuilder mendeleev = new StringBuilder();
        if (group > 8) {
            if (group > 10) {
                group -= 10;
            } else {
                group = 8;
            }
        }
        if(group % 5 == 4) {
            mendeleev.append("I");
            group++;
        }
        if (group >= 5){
            mendeleev.append("V");
            group -= 5;
        }
        if (group != 0) {
            mendeleev.append("I".repeat(group));
        }
        return mendeleev.toString();
    }

    /**
     * <p></p>Returns the periodic table group in CAS Roman numeral format,
     * (IA, IIA, IIIB, IVB, VB, etc.).
     * Example:<pre>
     * {@code groupToCAS(Elements.BR.group())}</pre>
     * will return {@code VIIA}.</p><p>
     * @param group the integer using the IUPAC numbering system (1-18) group of the element.
     * @return the element group in CAS Roman numeral format.
     */
    public static String groupToCAS(int group) {
        StringBuilder cas = new StringBuilder(groupToMendeleev(group));
        String ab = "A";
        if (group > 2 && group < 13) {
            ab = "B";
        }
        cas.append(ab);
        return cas.toString();
    }

    /**
     * <p></p>Returns the periodic table group in old IUPAC Roman numeral format,
     * (IA, IIA, IIIA, IVA, VA, etc.).
     * Example:<pre>
     * {@code groupToOldIUPAC(Elements.BR.group())}</pre>
     * will return {@code VIIB}.</p><p>
     * @param group the integer using the new IUPAC numbering system (1-18) group of the element.
     * @return the element group in old IUPAC Roman numeral format.
     */
    public static String groupToOldIUPAC(int group) {
        StringBuilder oldIupac = new StringBuilder(groupToMendeleev(group));
        if (groupToMendeleev(group).equals("VIII")) {
            return "0";
        }
        String ab = "";
        if (group <= 7) {
            ab = "A";
        }
        if (group >= 11) {
            ab = "B";
        }
        oldIupac.append(ab);
        return oldIupac.toString();
    }
}
