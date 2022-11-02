package com.ata;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Year;

//todo check every element and make sure all the data is correct.
/**
 * A Java enum representing thePeriodic Table of the Elements.
 * @author StephanPeters (peterstz,speters33w)
 */
public enum Elements {
    //NAME(AtomicNumber,"element","symbol",mass,neutrons,protons,electrons,period,group,"phase",radioactive,natural,metal,nonmetal,metalloid,"metalGroup",radiusVanDerWaals,radiusEmpirical,radiusCovalent,electronegativity,ionizationEnergy,density,meltingPoint,boilingPoint,isotopes,"discoverer",Year.of(Year),specificHeat,shells,valence),
    H(1,"Hydrogen","H",1.008F,0,1,1,1,1,"gas",false,true,false,true,false,"Non-Metal",120,25,32,2.2F,13.5984F,0.0000899F,14.175F,20.28F,3,"Cavendish",Year.of(1766),14.304F,1,1),
    HE(2,"Helium","He",4.002F,2,2,2,1,18,"gas",false,true,false,true,false,"Noble Gas",140,120,46,-1,24.5874F,0.000179F,-1,4.22F,5,"Janssen",Year.of(1868),5.193F,1,-1),
    LI(3,"Lithium","Li",6.941F,4,3,3,2,1,"solid",false,true,true,false,false,"Alkali Metal",182,145,133,0.98F,5.3917F,0.534F,453.85F,1615F,5,"Arfvedson",Year.of(1817),3.582F,2,1),
    BE(4,"Beryllium","Be",9.012F,5,4,4,2,2,"solid",false,true,true,false,false,"Alkaline Earth Metal",153,105,102,1.57F,9.3227F,1.85F,1560.15F,2742,6,"Vaulquelin",Year.of(1798),1.825F,2,2),
    B(5,"Boron","B",10.811F,6,5,5,2,13,"solid",false,true,false,false,true,"Metalloid",192,85,85,2.04F,8.298F,2.34F,2573.15F,4200F,6,"Gay-Lussac",Year.of(1808),1.026F,2,3),
    C(6,"Carbon","C",12.011F,6,6,6,2,14,"solid",false,true,false,true,false,"Non-Metal",170,70,75,2.55F,11.2603F,2.27F,3948.15F,4300F,7,"Prehistoric",Year.of(-1),0.709F,2,4),
    N(7,"Nitrogen","N",14.007F,7,7,7,2,15,"gas",false,true,false,true,false,"Non-Metal",155,65,71,3.04F,14.5341F,0.00125F,63.29F,77.36F,8,"Rutherford",Year.of(1772),1.04F,2,5),
    O(8,"Oxygen","O",15.999F,8,8,8,2,16,"gas",false,true,false,true,false,"Non-Metal",152,60,63,3.44F,13.6181F,0.00143F,50.5F,90.2F,8,"Priestley / Scheele",Year.of(1774),0.918F,2,6),
    F(9,"Fluorine","F",18.998F,10,9,9,2,17,"gas",false,true,false,true,false,"Halogen",147,50,64,3.98F,17.4228F,0.0017F,53.63F,85.03F,6,"Moissan",Year.of(1886),0.824F,2,7),
    NE(10,"Neon","Ne",20.18F,10,10,10,2,18,"gas",false,true,false,true,false,"Noble Gas",154,160,67,-1,21.5645F,0.0009F,24.703F,27.07F,8,"Ramsay and Travers",Year.of(1898),1.03F,2,8),
    NA(11,"Sodium","Na",22.99F,12,11,11,3,1,"solid",false,true,true,false,false,"Alkali Metal",227,180,155,0.93F,5.1391F,0.971F,371.15F,1156F,7,"Davy",Year.of(1807),1.228F,3,1),
    MG(12,"Magnesium","Mg",24.305F,12,12,12,3,2,"solid",false,true,true,false,false,"Alkaline Earth Metal",173,150,139,1.31F,7.6462F,1.74F,923.15F,1363F,8,"Black",Year.of(1755),1.023F,3,2),
    AL(13,"Aluminum","Al",26.982F,14,13,13,3,13,"solid",false,true,true,false,false,"Metal",184,125,126,184F,5.9858F,2.7F,933.4F,2792F,8,"Wohler",Year.of(1827),0.897F,3,3),
    SI(14,"Silicon","Si",28.086F,14,14,14,3,14,"solid",false,true,false,false,true,"Metalloid",210,110,116,210F,8.1517F,2.33F,1683.15F,3538F,8,"Berzelius",Year.of(1824),0.705F,3,4),
    P(15,"Phosphorus","P",30.974F,16,15,15,3,15,"solid",false,true,false,true,false,"Non-Metal",180,100,111,2.19F,10.4867F,1.82F,317.25F,553F,7,"Brand",Year.of(1669),0.769F,3,5),
    S(16,"Sulfur","S",32.065F,16,16,16,3,16,"solid",false,true,false,true,false,"Non-Metal",180,100,103,2.58F,10.36F,2.07F,388.51F,717.8F,10,"Prehistoric",Year.of(-1),0.71F,3,6),
    CL(17,"Chlorine","Cl",35.453F,18,17,17,3,17,"gas",false,true,false,true,false,"Halogen",175,100,99,3.16F,12.9676F,0.00321F,172.31F,239.11F,11,"Scheele",Year.of(1774),0.479F,3,7),
    AR(18,"Argon","Ar",39.948F,22,18,18,3,18,"gas",false,true,false,true,false,"Noble Gas",188,71,96,-1,15.7596F,0.00178F,83.96F,87.3F,8,"Rayleigh and Ramsay",Year.of(1894),0.52F,3,8),
    K(19,"Potassium","K",39.098F,20,19,19,4,1,"solid",false,true,true,false,false,"Alkali Metal",275,220,196,0.82F,4.3407F,0.862F,336.5F,1032F,10,"Davy",Year.of(1807),0.757F,4,1),
    CA(20,"Calcium","Ca",40.078F,20,20,20,4,2,"solid",false,true,true,false,false,"Alkaline Earth Metal",231,180,171,1F,6.1132F,1.54F,1112.15F,1757F,14,"Davy",Year.of(1808),0.647F,4,2),
    SC(21,"Scandium","Sc",44.956F,24,21,21,4,3,"solid",false,true,true,false,false,"Transition Metal",211,160,148,1.36F,6.5615F,2.99F,1812.15F,3109F,15,"Nilson",Year.of(1878),0.568F,4,-1),
    TI(22,"Titanium","Ti",47.867F,26,22,22,4,4,"solid",false,true,true,false,false,"Transition Metal",-1,140,136,1.54F,6.8281F,4.54F,1933.15F,3560F,9,"Gregor",Year.of(1791),0.523F,4,-1),
    V(23,"Vanadium","V",50.942F,28,23,23,4,5,"solid",false,true,true,false,false,"Transition Metal",-1,135,134,1.63F,6.7462F,6.11F,2175.15F,3680F,9,"del Rio",Year.of(1801),0.489F,4,-1),
    CR(24,"Chromium","Cr",51.996F,28,24,24,4,6,"solid",false,true,true,false,false,"Transition Metal",-1,140,122,1.66F,6.7665F,7.15F,2130.15F,2944F,9,"Vauquelin",Year.of(1797),0.449F,4,-1),
    MN(25,"Manganese","Mn",54.938F,30,25,25,4,7,"solid",false,true,true,false,false,"Transition Metal",-1,140,119,1.55F,7.434F,7.44F,1519.15F,2334F,11,"Gahn / Scheele",Year.of(1774),0.479F,4,-1),
    FE(26,"Iron","Fe",55.845F,30,26,26,4,8,"solid",false,true,true,false,false,"Transition Metal",-1,140,116,1.83F,7.9024F,7.87F,1808.15F,3134F,10,"Prehistoric",Year.of(-1),0.449F,4,-1),
    CO(27,"Cobalt","Co",58.933F,32,27,27,4,9,"solid",false,true,true,false,false,"Transition Metal",-1,135,111,1.88F,7.881F,8.86F,1768.15F,3200F,14,"Brandt",Year.of(1735),0.421F,4,-1),
    NI(28,"Nickel","Ni",58.693F,31,28,28,4,10,"solid",false,true,true,false,false,"Transition Metal",163,135,110,1.91F,7.6398F,8.91F,1726.15F,3186F,11,"Cronstedt",Year.of(1751),0.444F,4,-1),
    CU(29,"Copper","Cu",63.546F,35,29,29,4,11,"solid",false,true,true,false,false,"Transition Metal",140,135,112,1.9F,7.7264F,8.96F,1357.75F,2835F,11,"Prehistoric",Year.of(-1),0.385F,4,-1),
    ZN(30,"Zinc","Zn",65.38F,35,30,30,4,12,"solid",false,true,true,false,false,"Transition Metal",139,135,118,1.65F,9.3942F,7.13F,692.88F,1180F,15,"Prehistoric",Year.of(-1),0.388F,4,-1),
    GA(31,"Gallium","Ga",69.723F,39,31,31,4,13,"solid",false,true,true,false,false,"Metal",187,130,124,1.81F,5.9993F,5.91F,302.91F,2477F,14,"de Boisbaudran",Year.of(1875),0.371F,4,3),
    GE(32,"Germanium","Ge",72.64F,41,32,32,4,14,"solid",false,true,false,false,true,"Metalloid",211,125,121,2.01F,7.8994F,5.32F,1211.45F,3106F,17,"Winkler",Year.of(1886),0.32F,4,4),
    AS(33,"Arsenic","As",74.922F,42,33,33,4,15,"solid",false,true,false,false,true,"Metalloid",185,115,121,2.18F,9.7886F,5.78F,1090.15F,887F,14,"Albertus Magnus",Year.of(1250),0.329F,4,5),
    SE(34,"Selenium","Se",78.96F,45,34,34,4,16,"solid",false,true,false,true,false,"Non-Metal",190,115,116,2.55F,9.7524F,4.81F,494.15F,958F,20,"Berzelius",Year.of(1817),0.321F,4,6),
    BR(35,"Bromine","Br",79.904F,45,35,35,4,17,"liquid",false,true,false,true,false,"Halogen",185,115,114,2.96F,11.8138F,3.12F,266.05F,332F,19,"Balard",Year.of(1826),0.474F,4,7),
    KR(36,"Krypton","Kr",83.798F,48,36,36,4,18,"gas",false,true,false,true,false,"Noble Gas",202,-1,117,-1,13.9996F,0.00373F,115.93F,119.93F,23,"Ramsay and Travers",Year.of(1898),0.248F,4,8),
    RB(37,"Rubidium","Rb",85.468F,48,37,37,5,1,"solid",false,true,true,false,false,"Alkali Metal",303,235,210,0.82F,4.1771F,1.53F,312.79F,961F,20,"Bunsen and Kirchoff",Year.of(1861),0.363F,5,1),
    SR(38,"Strontium","Sr",87.62F,50,38,38,5,2,"solid",false,true,true,false,false,"Alkaline Earth Metal",249,200,185,0.95F,5.6949F,2.64F,1042.15F,1655F,18,"Davy",Year.of(1808),0.301F,5,2),
    Y(39,"Yttrium","Y",88.906F,50,39,39,5,3,"solid",false,true,true,false,false,"Transition Metal",-1,180,163,1.22F,6.2173F,4.47F,1799.15F,3609F,21,"Gadolin",Year.of(1794),0.298F,5,-1),
    ZR(40,"Zirconium","Zr",91.224F,51,40,40,5,4,"solid",false,true,true,false,false,"Transition Metal",-1,155,154,1.33F,6.6339F,6.51F,2125.15F,4682F,20,"Klaproth",Year.of(1789),0.278F,5,-1),
    NB(41,"Niobium","Nb",92.906F,52,41,41,5,5,"solid",false,true,true,false,false,"Transition Metal",-1,145,147,1.6F,6.7589F,8.57F,2741.15F,5017F,24,"Hatchett",Year.of(1801),0.265F,5,-1),
    MO(42,"Molybdenum","Mo",95.96F,54,42,42,5,6,"solid",false,true,true,false,false,"Transition Metal",-1,145,138,2.16F,7.0924F,10.2F,2890.15F,4912F,20,"Scheele",Year.of(1778),0.251F,5,-1),
    TC(43,"Technetium","Tc",98F,55,43,43,5,7,"artificial",true,false,true,false,false,"Transition Metal",-1,135,128,1.9F,7.28F,11.5F,2473.15F,5150F,23,"Perrier and Segrè",Year.of(1937),-1,5,-1),
    RU(44,"Ruthenium","Ru",101.07F,57,44,44,5,8,"solid",false,true,true,false,false,"Transition Metal",-1,130,125,2.2F,7.3605F,12.4F,2523.15F,4423F,16,"Klaus",Year.of(1844),0.238F,5,-1),
    RH(45,"Rhodium","Rh",102.906F,58,45,45,5,9,"solid",false,true,true,false,false,"Transition Metal",-1,135,125,2.28F,7.4589F,12.4F,2239.15F,3968F,20,"Wollaston",Year.of(1803),0.243F,5,-1),
    PD(46,"Palladium","Pd",106.42F,60,46,46,5,10,"solid",false,true,true,false,false,"Transition Metal",163,140,120,2.2F,8.3369F,12F,1825.15F,3236F,21,"Wollaston",Year.of(1803),0.244F,5,-1),
    AG(47,"Silver","Ag",107.868F,61,47,47,5,11,"solid",false,true,true,false,false,"Transition Metal",172,160,128,1.93F,7.5762F,10.5F,1234.15F,2435F,27,"Prehistoric",Year.of(-1),0.235F,5,-1),
    CD(48,"Cadmium","Cd",112.411F,64,48,48,5,12,"solid",false,true,true,false,false,"Transition Metal",158,155,136,1.69F,8.9938F,8.69F,594.33F,1040F,22,"Stromeyer",Year.of(1817),0.232F,5,-1),
    IN(49,"Indium","In",114.818F,66,49,49,5,13,"solid",false,true,true,false,false,"Metal",193,155,142,1.78F,5.7864F,7.31F,429.91F,2345F,34,"Reich and Richter",Year.of(1863),0.233F,5,3),
    SN(50,"Tin","Sn",118.71F,69,50,50,5,14,"solid",false,true,true,false,false,"Metal",217,145,140,1.96F,7.3439F,7.29F,505.21F,2875F,28,"Prehistoric",Year.of(-1),0.228F,5,4),
    SB(51,"Antimony","Sb",121.76F,71,51,51,5,15,"solid",false,true,false,false,true,"Metalloid",206,145,140,2.05F,8.6084F,6.69F,904.05F,1860F,29,"Early historic times",Year.of(1540),0.207F,5,5),
    TE(52,"Tellurium","Te",127.6F,76,52,52,5,16,"solid",false,true,false,false,true,"Metalloid",206,140,136,2.1F,9.0096F,6.23F,722.8F,1261F,29,"von Reichenstein",Year.of(1782),0.202F,5,6),
    I(53,"Iodine","I",126.904F,74,53,53,5,17,"solid",false,true,false,true,false,"Halogen",198,140,133,2.66F,10.4513F,4.93F,386.65F,457.4F,24,"Courtois",Year.of(1811),0.214F,5,7),
    XE(54,"Xenon","Xe",131.293F,77,54,54,5,18,"gas",false,true,false,true,false,"Noble Gas",216,-1,131,-1,12.1298F,0.00589F,161.45F,165.03F,31,"Ramsay and Travers",Year.of(1898),0.158F,5,8),
    CS(55,"Cesium","Cs",132.905F,78,55,55,6,1,"solid",false,true,true,false,false,"Alkali Metal",343,260,232,0.79F,3.8939F,1.87F,301.7F,944,22,"Bunsen and Kirchoff",Year.of(1860),0.242F,6,1),
    BA(56,"Barium","Ba",137.327F,81,56,56,6,2,"solid",false,true,true,false,false,"Alkaline Earth Metal",268,215,196,0.89F,5.2117F,3.59F,1002.15F,2170,25,"Davy",Year.of(1808),0.204F,6,2),
    LA(57,"Lanthanum","La",138.905F,82,57,57,6,3,"solid",false,true,true,false,false,"Lanthanide",-1,195,180,1.1F,5.5769F,6.15F,1193.15F,3737,19,"Mosander",Year.of(1839),0.195F,6,-1),
    CE(58,"Cerium","Ce",140.116F,82,58,58,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,185,163,1.12F,5.5387F,6.77F,1071.15F,3716,19,"Berzelius",Year.of(1803),0.192F,6,-1),
    PR(59,"Praseodymium","Pr",140.908F,82,59,59,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,185,176,1.13F,5.473F,6.77F,1204.15F,3793,15,"von Welsbach",Year.of(1885),0.193F,6,-1),
    ND(60,"Neodymium","Nd",144.242F,84,60,60,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,185,174,1.14F,5.525F,7.01F,1289.15F,3347,16,"von Welsbach",Year.of(1885),0.19F,6,-1),
    PM(61,"Promethium","Pm",145F,84,61,61,6,-1,"artificial",true,false,true,false,false,"Lanthanide",-1,185,173,1.13F,5.582F,7.26F,1204.15F,3273,14,"Marinsky et al.",Year.of(1945),-1,6,-1),
    SM(62,"Samarium","Sm",150.36F,88,62,62,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,185,172,1.17F,5.6437F,7.52F,1345.15F,2067,17,"Boisbaudran",Year.of(1879),0.197F,6,-1),
    EU(63,"Europium","Eu",151.964F,89,63,63,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,185,168,1.2F,5.6704F,5.24F,1095.15F,1802,21,"Demarcay",Year.of(1901),0.182F,6,-1),
    GD(64,"Gadolinium","Gd",157.25F,93,64,64,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,180,169,1.2F,6.1501F,7.9F,1585.15F,3546,17,"de Marignac",Year.of(1880),0.236F,6,-1),
    TB(65,"Terbium","Tb",158.925F,94,65,65,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,168,1.2F,5.8638F,8.23F,1630.15F,3503,24,"Mosander",Year.of(1843),0.182F,6,-1),
    DY(66,"Dysprosium","Dy",162.5F,97,66,66,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,167,1.22F,5.9389F,8.55F,1680.15F,2840,21,"de Boisbaudran",Year.of(1886),0.17F,6,-1),
    HO(67,"Holmium","Ho",164.93F,98,67,67,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,166,1.23F,6.0215F,8.8F,1743.15F,2993,29,"Delafontaine and Soret",Year.of(1878),0.165F,6,-1),
    ER(68,"Erbium","Er",167.259F,99,68,68,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,165,1.24F,6.1077F,9.07F,1795.15F,3503,16,"Mosander",Year.of(1843),0.168F,6,-1),
    TM(69,"Thulium","Tm",168.934F,100,69,69,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,164,1.25F,6.1843F,9.32F,1818.15F,2223,18,"Cleve",Year.of(1879),0.16F,6,-1),
    YB(70,"Ytterbium","Yb",173.054F,103,70,70,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,170,1.1F,6.2542F,6.97F,1097.15F,1469,16,"Marignac",Year.of(1878),0.155F,6,-1),
    LU(71,"Lutetium","Lu",174.967F,104,71,71,6,-1,"solid",false,true,true,false,false,"Lanthanide",-1,175,162,1.27F,5.4259F,9.84F,1936.15F,3675,22,"Urbain/ von Welsbach",Year.of(1907),0.154F,6,-1),
    HF(72,"Hafnium","Hf",178.49F,106,72,72,6,4,"solid",false,true,true,false,false,"Transition Metal",-1,155,152,1.3F,6.8251F,13.3F,2500.15F,4876,17,"Coster and von Hevesy",Year.of(1923),0.144F,6,-1),
    TA(73,"Tantalum","Ta",180.948F,108,73,73,6,5,"solid",false,true,true,false,false,"Transition Metal",-1,145,146,1.5F,7.5496F,16.7F,3269.15F,5731,19,"Ekeberg",Year.of(1801),0.14F,6,-1),
    W(74,"Tungsten","W",183.84F,110,74,74,6,6,"solid",false,true,true,false,false,"Transition Metal",-1,135,137,2.36F,7.864F,19.3F,3680.15F,5828,22,"J. and F. d'Elhuyar",Year.of(1783),0.132F,6,-1),
    RE(75,"Rhenium","Re",186.207F,111,75,75,6,7,"solid",false,true,true,false,false,"Transition Metal",-1,135,131,1.9F,7.8335F,21F,3453.15F,5869,21,"Tacke Noddack / Noddak / Berg",Year.of(1925),0.137F,6,-1),
    OS(76,"Osmium","Os",190.23F,114,76,76,6,8,"solid",false,true,true,false,false,"Transition Metal",-1,130,129,2.2F,8.4382F,22.6F,3300.15F,5285,19,"Tennant",Year.of(1803),0.13F,6,-1),
    IR(77,"Iridium","Ir",192.217F,115,77,77,6,9,"solid",false,true,true,false,false,"Transition Metal",-1,135,122,2.2F,8.967F,22.6F,2716.15F,4701,25,"Tennant",Year.of(1804),0.131F,6,-1),
    PT(78,"Platinum","Pt",195.084F,117,78,78,6,10,"solid",false,true,true,false,false,"Transition Metal",175,135,123,2.28F,8.9587F,21.5F,2045.15F,4098,32,"Ulloa/Wood",Year.of(1735),0.133F,6,-1),
    AU(79,"Gold","Au",196.967F,118,79,79,6,11,"solid",false,true,true,false,false,"Transition Metal",166,135,124,2.54F,9.2255F,19.3F,1337.73F,3129,21,"Prehistoric",Year.of(-1),0.129F,6,-1),
    HG(80,"Mercury","Hg",200.59F,121,80,80,6,12,"liquid",false,true,true,false,false,"Transition Metal",155,150,133,2F,10.4375F,13.5F,234.43F,630,26,"Prehistoric",Year.of(-1),0.14F,6,-1),
    TL(81,"Thallium","Tl",204.383F,123,81,81,6,13,"solid",false,true,true,false,false,"Metal",196,190,144,2.04F,6.1082F,11.9F,577.15F,1746F,28,"Crookes",Year.of(1861),0.129F,6,3),
    PB(82,"Lead","Pb",207.2F,125,82,82,6,14,"solid",false,true,true,false,false,"Metal",202,180,144,2.33F,7.4167F,11.3F,600.75F,2022F,29,"Prehistoric",Year.of(-1),0.129F,6,4),
    BI(83,"Bismuth","Bi",208.98F,126,83,83,6,15,"solid",false,true,true,false,false,"Metal",207,160,151,2.02F,7.2856F,9.81F,544.67F,1837F,19,"Geoffroy the Younger",Year.of(1753),0.122F,6,5),
    PO(84,"Polonium","Po",210F,126,84,84,6,16,"solid",true,true,false,false,true,"Metalloid",197,190,145,2F,8.417F,9.32F,527.15F,1235F,34,"Curie",Year.of(1898),-1,6,6),
    AT(85,"Astatine","At",210F,125,85,85,6,17,"solid",true,true,false,true,false,"Noble Gas",202,215,147,2.2F,9.3F,7F,575.15F,610F,21,"Corson et al.",Year.of(1940),-1,6,7),
    RN(86,"Radon","Rn",222F,136,86,86,6,18,"gas",true,true,true,false,false,"Alkali Metal",220,-1,142,-1,10.7485F,0.00973F,202.15F,211.3F,20,"Dorn",Year.of(1900),0.094F,6,8),
    FR(87,"Francium","Fr",223F,136,87,87,7,1,"solid",true,true,true,false,false,"Alkaline Earth Metal",348,-1,-1,0.7F,4.0727F,1.87F,300.15F,950,21,"Perey",Year.of(1939),-1,7,1),
    RA(88,"Radium","Ra",226F,138,88,88,7,2,"solid",true,true,true,false,false,"Actinide",283,-1,201,0.9F,5.2784F,5.5F,973.15F,2010F,15,"Pierre and Marie Curie",Year.of(1898),-1,7,2),
    AC(89,"Actinium","Ac",227F,138,89,89,7,3,"solid",true,true,true,false,false,"Actinide",-1,195,186,1.1F,5.17F,10.1F,1323.15F,3471F,11,"Debierne/Giesel",Year.of(1899),0.12F,7,-1),
    TH(90,"Thorium","Th",232.038F,142,90,90,7,-1,"solid",true,true,true,false,false,"Actinide",-1,180,175,1.3F,6.3067F,11.7F,2028.15F,5061F,12,"Berzelius",Year.of(1828),0.113F,7,-1),
    PA(91,"Protactinium","Pa",231.036F,140,91,91,7,-1,"solid",true,true,true,false,false,"Actinide",-1,180,169,1.5F,5.89F,15.4F,1873.15F,4300F,14,"Hahn and Meitner",Year.of(1917),-1,7,-1),
    U(92,"Uranium","U",238.029F,146,92,92,7,-1,"solid",true,true,true,false,false,"Actinide",186,175,170,1.38F,6.1941F,19F,1405.15F,4404F,15,"Peligot",Year.of(1841),0.116F,7,-1),
    NP(93,"Neptunium","Np",237F,144,93,93,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,175,171,1.36F,6.2657F,20.5F,913.15F,4273F,153,"McMillan and Abelson",Year.of(1940),-1,7,-1),
    PU(94,"Plutonium","Pu",244F,150,94,94,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,175,172,1.28F,6.0262F,19.8F,913.15F,3501F,163,"Seaborg et al.",Year.of(1940),-1,7,-1),
    AM(95,"Americium","Am",243F,148,95,95,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,175,166,1.3F,5.9738F,13.7F,1267.15F,2880F,133,"Seaborg et al.",Year.of(1944),-1,7,-1),
    CM(96,"Curium","Cm",247F,151,96,96,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,176,166,1.3F,5.9915F,13.5F,1340.15F,3383F,133,"Seaborg et al.",Year.of(1944),-1,7,-1),
    BK(97,"Berkelium","Bk",247F,150,97,97,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,1.3F,6.1979F,14.8F,1259.15F,983F,83,"Seaborg et al.",Year.of(1949),-1,7,-1),
    CF(98,"Californium","Cf",251F,153,98,98,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,1.3F,6.2817F,15.1F,1925.15F,1173,123,"Seaborg et al.",Year.of(1950),-1,7,-1),
    ES(99,"Einsteinium","Es",252F,153,99,99,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,1.3F,6.42F,13.5F,1133.15F,-1,123,"Ghiorso et al.",Year.of(1952),-1,7,-1),
    FM(100,"Fermium","Fm",257F,157,100,100,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,1.3F,6.5F,-1,-1,-1,103,"Ghiorso et al.",Year.of(1953),-1,7,-1),
    MD(101,"Mendelevium","Md",258F,157,101,101,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,1.3F,6.58F,-1,-1,-1,33,"Ghiorso et al.",Year.of(1955),-1,7,-1),
    NO(102,"Nobelium","No",259F,157,102,102,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,1.3F,6.65F,-1,-1,-1,73,"Ghiorso et al.",Year.of(1958),-1,7,-1),
    LR(103,"Lawrencium","Lr",262F,159,103,103,7,-1,"artificial",true,false,true,false,false,"Actinide",-1,-1,-1,-1,-1,-1,-1,-1,203,"Ghiorso et al.",Year.of(1961),-1,7,-1),
    RF(104,"Rutherfordium","Rf",261F,157,104,104,7,4,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,18.1F,-1,-1,-1,"Ghiorso et al.",Year.of(1969),-1,7,-1),
    DB(105,"Dubnium","Db",262F,157,105,105,7,5,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,39F,-1,-1,-1,"Ghiorso et al.",Year.of(1970),-1,7,-1),
    SG(106,"Seaborgium","Sg",266F,160,106,106,7,6,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,35F,-1,-1,-1,"Ghiorso et al.",Year.of(1974),-1,7,-1),
    BH(107,"Bohrium","Bh",264F,157,107,107,7,7,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,37F,-1,-1,-1,"Armbruster and Münzenberg",Year.of(1981),-1,7,-1),
    HS(108,"Hassium","Hs",267F,159,108,108,7,8,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,41F,-1,-1,-1,"Armbruster and Münzenberg",Year.of(1983),-1,7,-1),
    MT(109,"Meitnerium","Mt",268F,159,109,109,7,9,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,35F,-1,-1,-1,"Armbruster and Münzenberg et al.",Year.of(1982),-1,7,-1),
    DS (110,"Darmstadtium","Ds",271F,161,110,110,7,10,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(1994),-1,7,-1),
    RG (111,"Roentgenium","Rg",272F,161,111,111,7,11,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(1994),-1,7,-1),
    CN (112,"Copernicium","Cn",285F,173,112,112,7,12,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(1996),-1,7,-1),
    NH(113,"Nihonium","Nh",284F,171,113,113,7,13,"artificial",true,false,true,false,false,"null",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(2004),-1,7,3),
    FL(114,"Flerovium","Fl",289F,175,114,114,7,14,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(1999),-1,7,4),
    MC(115,"Moscovium","Mc",288F,173,115,115,7,15,"artificial",true,false,true,false,false,"null",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(2010),-1,7,5),
    LV(116,"Livermorium","Lv",292F,176,116,116,7,16,"artificial",true,false,true,false,false,"Transactinide",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(2000),-1,7,6),
    TS(117,"Tennessine","Ts",295F,178,117,117,7,17,"artificial",true,false,false,true,false,"null",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(2010),-1,7,7),
    OG(118,"Oganesson","Og",294F,176,118,118,7,18,"artificial",true,false,false,true,false,"Noble Gas",-1,-1,-1,-1,-1,-1,-1,-1,-1,"null",Year.of(2006),-1,7,8);
    private final int atomicNumber;
    private final String element;
    private final String symbol;
    private final float mass;
    private final int neutrons;
    private final int protons;
    private final int electrons;
    private final int period;
    private final int group;
    private final Phase phase;
    private final boolean radioactive;
    private final boolean natural;
    private final boolean metal;
    private final boolean nonmetal;
    private final boolean metalloid;
    private final Metal metalGroup;
    private final int radiusVanDerWaals;
    private final int radiusEmpirical;
    private final int radiusCovalent;
    private final float electronegativity;
    private final float ionizationEnergy;
    private final float density;
    private final float meltingPoint;
    private final float boilingPoint;
    public final int isotopes;
    private final String discoverer;
    private final Year discoveryYear;
    private final float specificHeat;
    private final int shells;
    private final int valence;

    Elements(int atomicNumber, String element, String symbol, float mass, int neutrons, int protons, int electrons,
             int period, int group, String phaseName, boolean radioactive, boolean natural, boolean metal, boolean nonmetal,
             boolean metalloid, String metalGroup, int radiusVanDerWaals, int radiusEmpirical, int radiusCovalent,
             float electronegativity, float ionizationEnergy, float density, float meltingPoint, float boilingPoint,
             int isotopes, String discoverer, Year discoveryYear, float specificHeat, int shells, int valence) {
        this.atomicNumber = atomicNumber;
        this.element = element;
        this.symbol = symbol;
        this.mass = mass;
        this.neutrons = neutrons;
        this.protons = protons;
        this.electrons = electrons;
        this.period = period;
        this.group = group;
        this.phase = Phase.getPhase(phaseName);
        this.radioactive = radioactive;
        this.natural = natural;
        this.metal = metal;
        this.nonmetal = nonmetal;
        this.metalloid = metalloid;
        this.metalGroup = Metal.getMetal(metalGroup);
        this.radiusVanDerWaals = radiusVanDerWaals;
        this.radiusEmpirical = radiusEmpirical;
        this.radiusCovalent = radiusCovalent;
        this.electronegativity = electronegativity;
        this.ionizationEnergy = ionizationEnergy;
        this.density = density;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.isotopes = isotopes;
        this.discoverer = toUtf8(discoverer);
        this.discoveryYear = discoveryYear;
        this.specificHeat = specificHeat;
        this.shells = shells;
        this.valence = valence;
    }
    
    private enum Phase {
        SOLID("solid"),
        LIQUID("liquid"),
        GAS("gas"),
        ARTIFICIAL("artificial");
        private final String phaseName;
        Phase(String phaseName) {
            this.phaseName = phaseName;
        }
        private static Phase getPhase (String phaseName) {
            for(Phase phase : Phase.values()) {
                if(phase.phaseName.equals(phaseName)) return phase;
            }
            return null;
        }
    }

    private enum Metal {
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

        private final String metal;
        Metal(String metalType) {
            this.metal = metalType;
        }
        private static Metal getMetal (String metalType) {
            for(Metal metal : Metal.values()) {
                if(metal.metal.equals(metalType)) return metal;
            }
            return null;
        }
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
        return element;
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
     * will return {@code 79.904}.
     * @return the Atomic Weight of an element in atomic mass units (amu).
     */
    public double mass() {
        return mass;
    }

    /**
     * Returns the number of neutrons in an element's atom.
     * Example:
     * {@code Elements.BR.neutrons()}
     * will return {@code 45}.
     * @return the number of neutrons of the element.
     */
    public int neutrons() {
        return neutrons;
    }

    /**
     * Returns the number of protons in an element's atom.
     * Example:
     * {@code Elements.BR.protons()}
     * will return {@code 35}.
     * @return the number of protons of the element.
     */
    public int protons() {
        return protons;
    }

    /**
     * Returns the number of electrons in an element's atom.
     * Example:
     * {@code Elements.BR.electrons()}
     * will return {@code 35}.
     * @return the number of electrons of the element.
     */
    public int electrons() {
        return electrons;
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
     * (IA, IIA, IIIB, IVB, etc.).
     * Example:<pre>
     * {@code Elements.BR.groupRoman()}</pre>
     * will return {@code VIIA}.</p><br><p>
     * To return the table group in Mendeleev format, use {@code substring}.<pre>
     * {@code (Elements.BR.groupRoman().substring(0, Elements.BR.groupRoman().length() - 1)}</pre>
     * will return {@code VII}.</p>
     * @return the group of the element in CAS Roman Numeral format.
     */
    public String groupRoman() {
        return groupToRoman(group);
    }

    /**
     * Returns the periodic table block of the element (s,p,d,f).
     * Example:
     * {@code Elements.BR.block()}
     * will return {@code 'p'}.
     * @return the periodic table block of the element.
     */
    public char block(){
        return getBlock(group, period);
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
     * Returns true if the element is radioactive.
     * Example:
     * {@code Elements.BR.isRadioactive()}
     * will return {@code false}.
     * @return true if the element is radioactive.
     */
    public boolean isRadioactive() {
        return radioactive;
    }

    /**
     * Returns true if the element is natural.
     * Example:
     * {@code Elements.BR.isNatural()}
     * will return {@code true}.
     * @return true if the element is natural.
     */
    public boolean isNatural() {
        return natural;
    }

    /**
     * Returns true if the element is metal.
     * Example:
     * {@code Elements.BR.isMetal()}
     * will return {@code false}.
     * @return true if the element is metal.
     */
    public boolean isMetal() {
        return metal;
    }

    /**
     * Returns true if the element is non-metal.
     * Example:
     * {@code Elements.BR.isNonMetal()}
     * will return {@code true}.
     * @return true if the element is non-metal.
     */
    public boolean isNonMetal() {
        return nonmetal;
    }

    /**
     * Returns true if the element is metalloid.
     * Example:
     * {@code Elements.BR.isMetalloid()}
     * will return {@code false}.
     * @return true if the element is metalloid.
     */
    public boolean isMetalloid() {
        return metalloid;
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

    /**
     * Returns the van der Waals atomic radius of the element in picometers (pm).
     * Example:
     * {@code Elements.BR.radiusVanDerWaals()}
     * will return {@code 185}.
     * @return the van der Waals atomic radius of the element in picometers (pm).
     */
    public int radiusVanDerWaals() {
        return radiusVanDerWaals;
    }

    /**
     * Returns the Empirical atomic radius of the element in picometers (pm).
     * Example:
     * {@code Elements.BR.radiusEmpirical()}
     * will return {@code 115}.
     * @return the van der Waals atomic radius of the element in picometers (pm).
     */
    public int radiusEmpirical() {
        return radiusEmpirical;
    }

    /**
     * Returns the Covalent (single bond) atomic radius of the element in picometers (pm).
     * Example:
     * {@code Elements.BR.radiusCovalent()}
     * will return {@code 114}.
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

    //todo check isotopes, not sure what this field tells us, maybe change to stable isotopes?

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

    //todo this field may need to be changed to J/(kg K) or J/(g-C) as a default.
    //also define starting temp and barometric pressure.

    /**
     * Returns the specific heat of an element in Joules per gram Kelvin J/(g·K).
     * Example:
     * {@code Elements.BR.specificHeat()}
     * will return {@code 0.474}.
     * @return the specific heat of an element (J/(g·K)).
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
    public int electronShells() {
        return shells;
    }

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

    @Override
    public String toString() {
        return String.format("[%14s- Atomic Number: %3d, Element: %2s, Atomic Weight (amu): %-7s ]",
                element, atomicNumber, symbol, mass);
    }

    //todo finish deepToString method.
    public String deepToString(){
        StringBuilder elementDeepToString = new StringBuilder();
        elementDeepToString.append
                (String.format("%s%n%nAtomic Number: %d%nElement: %s%nElement Name: %s%nAtomic Weight (amu): %.3f%n",
                element.toUpperCase(), atomicNumber, symbol, element, mass));
        elementDeepToString.append
                (String.format("Standard State: %s%n",
                 phase.phaseName.substring(0, 1).toUpperCase() + phase.phaseName.substring(1)));

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
     * @param group the periodic table group of the element using the IUPAC numbering system (1-18).
     * @param period the periodic table period of the element.
     * @return the periodic table block of the element.
     */
    public char getBlock(int group, int period){
        if (group == 3 && period >= 6) {
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
     * <p></p>Returns the periodic table group in CAS Roman numeral format,
     * (IA, IIA, IIIB, IVB, etc.).
     * Example:<pre>
     * {@code groupToRoman(Elements.BR.group())}</pre>
     * will return {@code VIIA}.</p><p>
     * To return the table group in Mendeleev format, use {@code substring}.<pre>
     * {@code (groupToRoman(Elements.BR.group().substring(0, Elements.BR.group().length() - 1)}</pre>
     * will return {@code VII}.</p>
     * @param group the integer using the IUPAC numbering system (1-18) group of the element.
     * @return the element group in CAS Roman numeral format.
     */
    public static String groupToRoman(int group) {
        if (group < 1 || group > 18) {
            return "";
        }
        StringBuilder roman = new StringBuilder();
        String ab = "A";
        if (group > 2 && group < 13) {
            ab = "B";
        }
        if (group > 8) {
            if (group > 10) {
                group -= 10;
            } else {
                group = 8;
            }
        }
        if(group % 5 == 4) {
            roman.append("I");
            group++;
        }
        if (group >= 5){
            roman.append("V");
            group -= 5;
        }
        if (group != 0) {
            roman.append("I".repeat(group));
        }
        roman.append(ab);
        return roman.toString();
    }
}
