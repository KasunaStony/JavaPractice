/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author maruiling
 */
public class lovelive {
    public static void main(String[] args){
/*need*/int time = 200;
/*need*/int LpWday = 80;
        int totalW = LpWday * time/24;
        int Lptotal = time * 10 - totalW;
        
        int hadPt = 0;
        int hadItem = 0;
        
/*need*/int needExp = 1722;
        
        
/*need*/String NDifficulty = "Expert";
        
        
        int itemPer = 0;
        int Lpper = 0;
        int expGetN = 0;
        
        switch (NDifficulty) {
            case "Expert":
                itemPer = 27;
                Lpper = 25;
                expGetN = 83;
                break;
            case "Hard":
                itemPer = 16;
                Lpper = 15;
                expGetN = 46;
                break;
            case "Normal":
                itemPer = 10;
                Lpper = 10;
                expGetN = 26;
                break;
            case "Easy":
                itemPer = 5;
                Lpper = 5;
                expGetN = 12;
                break;
            default:
                break;
        }
        
        int AmountNtotal = Lptotal/Lpper;
        
        
        int itemTotal = itemPer * AmountNtotal + hadItem;
        
        int expGetNTotal = expGetN * AmountNtotal;
        
        
/*need*/String ADifficulty = "Expert";
        int ptGain = 0;
/*need*/String Combo = "S";
/*need*/String Score = "S";
        int itemCost = 0;
        int expGetA =0;
        
        switch (ADifficulty) {
            case "Expert":{
                itemCost = 75;
                expGetA = 83;
                switch (Combo){
                    case "S":{
                        switch (Score){
                            case"S":
                                ptGain = 404;
                                break;
                            case"A":
                                ptGain = 386;
                                break;
                            case"B":
                                ptGain = 364;
                                break;
                            case"C":
                                ptGain = 346;
                                break;
                            case"-":
                                ptGain = 328;
                                break;
                              
                        }
                        break;
                    }
                    case "A":{
                        switch (Score){
                            case"S":
                                ptGain = 393;
                                break;
                            case"A":
                                ptGain = 375;
                                break;
                            case"B":
                                ptGain = 354;
                                break;
                            case"C":
                                ptGain = 336;
                                break;
                            case"-":
                                ptGain = 319;
                                break;
                           
                        }
                        break;
                    }
                    case "B":{
                        switch (Score){
                            case"S":
                                ptGain = 371;
                                break;
                            case"A":
                                ptGain = 354;
                                break;
                            case"B":
                                ptGain = 334;
                                break;
                            case"C":
                                ptGain = 317;
                                break;
                            case"-":
                                ptGain = 301;
                                break;
                            
                        }
                        break;
                    }
                        case "C":{
                        switch (Score){
                            case"S":
                                ptGain = 363;
                                break;
                            case"A":
                                ptGain = 347;
                                break;
                            case"B":
                                ptGain = 327;
                                break;
                            case"C":
                                ptGain = 311;
                                break;
                            case"-":
                                ptGain = 295;
                                break;
                            
                        }
                        break;
                        }
                        case "-":{
                        switch (Score){
                            case"S":
                                ptGain = 356;
                                break;
                            case"A":
                                ptGain = 340;
                                break;
                            case"B":
                                ptGain = 321;
                                break;
                            case"C":
                                ptGain = 305;
                                break;
                            case"-":
                                ptGain = 289;
                                break;
                          
                        }
                        break;
                    
                }
                 
                }
                break;
            }
                
                
        
            case "Hard":{
                itemCost = 45;
                expGetA = 46;
                switch (Combo){
                    case "S":{
                        switch (Score){
                            case"S":
                                ptGain = 233;
                                break;
                            case"A":
                                ptGain = 223;
                                break;
                            case"B":
                                ptGain = 212;
                                break;
                            case"C":
                                ptGain = 201;
                                break;
                            case"-":
                                ptGain = 191;
                                break;
                          
                                         
                        }
                        break;
                    }
                    case "A":{
                        switch (Score){
                            case"S":
                                ptGain = 227;
                                break;
                            case"A":
                                ptGain = 216;
                                break;
                            case"B":
                                ptGain = 206;
                                break;
                            case"C":
                                ptGain = 196;
                                break;
                            case"-":
                                ptGain = 185;
                                break;
                            
                        }
                        break;
                    }
                        case "B":{
                        switch (Score){
                            case"S":
                                ptGain = 220;
                                break;
                            case"A":
                                ptGain = 210;
                                break;
                            case"B":
                                ptGain = 200;
                                break;
                            case"C":
                                ptGain = 190;
                                break;
                            case"-":
                                ptGain = 180;
                                break;
                           
                        }
                        break;
                        }
                        case "C":{
                        switch (Score){
                            case"S":
                                ptGain = 216;
                                break;
                            case"A":
                                ptGain = 206;
                                break;
                            case"B":
                                ptGain = 196;
                                break;
                            case"C":
                                ptGain = 186;
                                break;
                            case"-":
                                ptGain = 176;
                                break;
                           
                        }
                        break;
                        }
                        case "-":{
                        switch (Score){
                            case"S":
                                ptGain = 211;
                                break;
                            case"A":
                                ptGain = 202;
                                break;
                            case"B":
                                ptGain = 192;
                                break;
                            case"C":
                                ptGain = 182;
                                break;
                            case"-":
                                ptGain = 173;
                                break;
                            
                        }
                        break;
                        }
                       
                    
                }
                break;
        }
            case "Normal":{
                itemCost = 30;
                expGetA = 26;
                switch (Combo){
                    case "S":{
                        switch (Score){
                            case"S":
                                ptGain = 140;
                                break;
                            case"A":
                                ptGain = 135;
                                break;
                            case"B":
                                ptGain = 130;
                                break;
                            case"C":
                                ptGain = 124;
                                break;
                            case"-":
                                ptGain = 117;
                                break;
                            
                                         
                        }
                        break;
                    }
                    case "A":{
                        switch (Score){
                            case"S":
                                ptGain = 138;
                                break;
                            case"A":
                                ptGain = 133;
                                break;
                            case"B":
                                ptGain = 128;
                                break;
                            case"C":
                                ptGain = 121;
                                break;
                            case"-":
                                ptGain = 115;
                                break;
                            
                        }
                        break;
                    }
                    case "B":{
                        switch (Score){
                            case"S":
                                ptGain = 135;
                                break;
                            case"A":
                                ptGain = 130;
                                break;
                            case"B":
                                ptGain = 125;
                                break;
                            case"C":
                                ptGain = 119;
                                break;
                            case"-":
                                ptGain = 113;
                                break;
                            
                        }
                        break;
                    }
                    case "C":{
                        switch (Score){
                            case"S":
                                ptGain = 132;
                                break;
                            case"A":
                                ptGain = 127;
                                break;
                            case"B":
                                ptGain = 123;
                                break;
                            case"C":
                                ptGain = 116;
                                break;
                            case"-":
                                ptGain = 110;
                                break;
                            
                        }
                        break;
                    }
                    case "-":{
                        switch (Score){
                            case"S":
                                ptGain = 130;
                                break;
                            case"A":
                                ptGain = 125;
                                break;
                            case"B":
                                ptGain = 120;
                                break;
                            case"C":
                                ptGain = 114;
                                break;
                            case"-":
                                ptGain = 108;
                                break;
                            
                        }
                        break;
                    }
                    
                }
                break;
            }
                
            case "Easy":{
                itemCost = 15;
                expGetA = 12;
                switch (Combo){
                    case "S":{
                        switch (Score){
                            case"S":
                                ptGain = 65;
                                break;
                            case"A":
                                ptGain = 64;
                                break;
                            case"B":
                                ptGain = 62;
                                break;
                            case"C":
                                ptGain = 59;
                                break;
                            case"-":
                                ptGain = 56;
                                break;
                            
                                         
                        }
                        break;
                    }
                    case "A":{
                        switch (Score){
                            case"S":
                                ptGain = 64;
                                break;
                            case"A":
                                ptGain = 62;
                                break;
                            case"B":
                                ptGain = 61;
                                break;
                            case"C":
                                ptGain = 58;
                                break;
                            case"-":
                                ptGain = 55;
                                break;
                            
                        }
                        break;
                    }
                    case "B":{
                        switch (Score){
                            case"S":
                                ptGain = 62;
                                break;
                            case"A":
                                ptGain = 61;
                                break;
                            case"B":
                                ptGain = 60;
                                break;
                            case"C":
                                ptGain = 57;
                                break;
                            case"-":
                                ptGain = 54;
                                break;
                            
                        }
                        break;
                    }
                    case "C":{
                        switch (Score){
                            case"S":
                                ptGain = 61;
                                break;
                            case"A":
                                ptGain = 60;
                                break;
                            case"B":
                                ptGain = 59;
                                break;
                            case"C":
                                ptGain = 56;
                                break;
                            case"-":
                                ptGain = 53;
                                break;
                            
                        }
                    }
                    case "-":{
                        switch (Score){
                            case"S":
                                ptGain = 60;
                                break;
                            case"A":
                                ptGain = 59;
                                break;
                            case"B":
                                ptGain = 58;
                                break;
                            case"C":
                                ptGain = 55;
                                break;
                            case"-":
                                ptGain = 52;
                                break;
                            
                        }
                        break;
                    }
                        
                    
                }
                break;
            }
                
                
                
                
                
        }
        
        int playTime = itemTotal / itemCost;
        
        int expGetATotal = expGetA * playTime;
        
        int expTotal = expGetNTotal + expGetATotal;
        
        int gainPt = playTime * ptGain;
        
        
/*need*/int wantPt = 25000;
        
        int needPt = wantPt - gainPt - hadPt;
        
        int needSong = needPt / ptGain;
        
        int needItem = needSong * itemCost;
        
        int needNSong = needItem / itemPer;
        
        int needLpper = Lpper * needNSong;
        
/*need*/int LovecaPer = 63;
        
        int needLoveca = needLpper / LovecaPer;
        
        int LpGet = needLoveca * LovecaPer;
        
        int expGetNNew = LpGet / Lpper * expGetN;
        
        int expGetANew = (LpGet / Lpper * itemPer)/itemCost * expGetA;
        
        int expTotalNew = expTotal + expGetNNew + expGetANew;
        
        int levelUp = expTotalNew / needExp;
        
        int newNeedLoveca = needLoveca - levelUp;
        
        
            System.out.println(newNeedLoveca);
                
                
        }
                    
       
        
        
            
        
        
        
        
       
        
        
        
        
        
        
        
        
    }
    

