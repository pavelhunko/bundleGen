package com.ibm.belarus;

public class StringGenerator {
	
	public static String cvtGen(String bundleNum) {
		String cvtString = bundleNum
				+ "|-|2 2015-01-27 2015-01-27|618 624a 666 668 678a 702a 706a 724 754 756 758 624b 788 806 820 822 693 708 838 846 848a 866 865 642 864a 897 649 760|0|*|\n";
		return cvtString;
	}

	public static String pcmGenFirstPart(String bundleNum) {
		String pcmFString = "product\n{\ndescription: \"" + bundleNum
				+ " ServicePac Warranty Service Upgrade 3 YR 24x7 Same Day ORT 6hrCL/4hrPD\";\nproductNumber: \"";
		return pcmFString;
	}

	public static String pcmGenSecondPart(String partNum) {
		String pcmSString = partNum
				+ "\";\nvalues:\n   ibm_disable_default_option_group_max=\"TRUE\";\n   Category=\"Services\";\n}\n";
		return pcmSString;
	}
}
