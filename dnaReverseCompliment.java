


static String dnaComplement(String s) {
        
        String revS=new StringBuilder(s).reverse().toString();
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<revS.length();i++){
            char temp=revS.charAt(i);
            switch(temp){
                case 'A':
                    res.append("T");
                    break;
                case 'T':
                    res.append("A");
                    break;
                case 'C':
                    res.append("G");
                    break;
                case 'G':
                    res.append("C");
                    break;
            }
            
        }
        return res.toString();
    }

	
	
	