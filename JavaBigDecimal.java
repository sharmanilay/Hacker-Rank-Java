        String newArray[] = new String[n];
        for(int i=0; i<newArray.length; i++) {
            newArray[i] = s[i];
        }

        Arrays.sort(newArray, Collections.reverseOrder(new Comparator<String>() {
            @Override
                public int compare(String a1, String a2) {
                    BigDecimal a = new BigDecimal(a1);
                    BigDecimal b = new BigDecimal(a2);
                    return a.compareTo(b);
                }
        }));
        s = newArray;
