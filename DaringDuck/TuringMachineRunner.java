package DaringDuck;

import java.util.*;


public class TuringMachineRunner{
    static ArrayList<Character> input = new ArrayList<Character>();
    static Tape tape;
    static ArrayList<State> statesList = new ArrayList<State>();
    static ArrayList<Transition> s0transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s1transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s2transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s3transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s4transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s5transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s6transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s8transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s9transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s10transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s11transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s12transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s13transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s14transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s15transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s16transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s17transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s18transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s19transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s20transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s21transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s22transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s23transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s24transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s25transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s26transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s27transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s28transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s29transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s30transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s31transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s32transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s33transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s34transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s35transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s36transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s37transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s38transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s39transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s40transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s41transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s42transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s43transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s44transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s45transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s46transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s47transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s48transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s49transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s50transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s51transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s52transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s53transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s54transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s55transitionsList =  new ArrayList<Transition>();    
    static ArrayList<Transition> s56transitionsList =  new ArrayList<Transition>();    
    static ArrayList<Transition> s57transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s58transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s59transitionsList =  new ArrayList<Transition>();    
    static ArrayList<Transition> s60transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s61transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s62transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s63transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s64transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s65transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s66transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s67transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s68transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s69transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s70transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s71transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s72transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s73transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s74transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s75transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s76transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s77transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s78transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s79transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s80transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s81transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s82transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s83transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s84transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s85transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s86transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s87transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s88transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s89transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s90transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s91transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s92transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s93transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s94transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s95transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s96transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s97transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s98transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s99transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s100transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s101transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s102transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s103transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s104transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s105transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s106transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s107transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s108transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s109transitionsList =  new ArrayList<Transition>();   
    static ArrayList<Transition> s110transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s111transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s112transitionsList =  new ArrayList<Transition>();


    static StateMachine turingTest;
    static State s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11,s12, s13,s14,s15,s16,s17,s18,s19,s20,
     s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39, s40, s41, s42,
     s43, s44, s45, s46, s47, s48, s49, s50, s51, s52, s53, s54, s55, s56, s57, s58, s59, s60, s61, s62, s63, s64, s65, s66,
     s67, s68, s69, s70, s71, s72, s73, s74, s75, s76, s77, s78, s79, s80, s81, s82, s83, s84, s85, s86, s87, s88,
     s89, s90, s91, s92, s93, s94, s95, s96, s97, s98, s99, s100, s101, s102, s103, s104, s105, s106, s107, s108, s109, s110, s111, s112;
    
    static Transition s0t1, s0t2, s1t1, s1t2, s1t3, s2t1, s3t1, s4t1, s4t2, s4t3, s5t1, s5t2, s5t3, s6t1, s6t2, 
    s8t1, s9t1, s10t1, s11t1, s12t1, s13t1, s14t1, s15t1, s16t1, s17t1, s18t1, s19t1, s20t1, s21t1, 
    s22t1, s23t1, s24t1, s25t1, s26t1, s27t1, s28t1, s29t1, s30t1, s31t1, s32t1, s33t1, s34t1, s35t1, 
    s36t1, s37t1, s38t1, s39t1, s40t1, s41t1, s42t1, s43t1, s44t1, s45t1, s46t1, s47t1,s48t1, s49t1,s50t1,s51t1, s52t1,
    s53t1,s54t1,s55t1,s56t1, s57t1,s58t1,s59t1,s60t1,s61t1,s62t1,s63t1,s64t1,s65t1,s66t1,s67t1,s68t1,s69t1,s70t1,s71t1,
    s72t1, s73t1, s74t1, s75t1, s76t1, s77t1, s78t1, s79t1, s80t1, s81t1, s82t1, s83t1, s84t1, s85t1, s86t1, 
    s87t1, s88t1, s89t1, s90t1, s91t1, s92t1, s93t1, s94t1, s95t1, s96t1, s97t1, s98t1, s99t1, s100t1, s101t1, s102t1, 
    s103t1,  s104t1, s105t1, s106t1, s107t1, s108t1, s109t1, s110t1, s111t1, s112t1;
    
    public static void main(String[] args) {   
        for(int i = 0; i < 3000; i++){
            input.add('2'); 
        }
        tape = new Tape(input);

        //s6: halt state
        s7 = new State("s7", "halt");

        s6t1 = new Transition("s6", '2', '2', "left");
        s6t2 = new Transition("s0", '1', '1', "right");
        s6transitionsList.add(s6t1);
        s6transitionsList.add(s6t2);
        s6 = new State("s6", "NH", s6transitionsList);
        
        s5t1 = new Transition("s5", '1', '1', "left");
        s5t2 = new Transition("s6", '2', '2', "left");
        s5t3 = new Transition("s7", 'N', '1', "right");
        s5transitionsList.add(s5t1);
        s5transitionsList.add(s5t2);
        s5transitionsList.add(s5t3);
        s5 = new State("s5", "NH", s5transitionsList); 

        s4t1 =  new Transition("s5", 'N', '1', "left");
        s4transitionsList.add(s4t1);
        s4 = new State("s4", "NH", s4transitionsList);

        s112t1 =  new Transition("s4", 'N', '1', "right");
        s112transitionsList.add(s112t1);
        s112 = new State("s112", "NH", s112transitionsList);

        s42t1 =  new Transition("s43", 'N', '1', "right");
        s42transitionsList.add(s42t1);
        s42 = new State("s42", "NH", s42transitionsList);
  
        s43t1 =  new Transition("s44", 'N', '1', "right");
        s43transitionsList.add(s43t1);
        s43 = new State("s43", "NH", s43transitionsList);
  
        s44t1 =  new Transition("s45", 'N', '1', "right");
        s44transitionsList.add(s44t1);
        s44 = new State("s44", "NH", s44transitionsList);
  
        s45t1 =  new Transition("s46", 'N', '1', "right");
        s45transitionsList.add(s45t1);
        s45 = new State("s45", "NH", s45transitionsList);

        s46t1 =  new Transition("s47", 'N', '1', "right");
        s46transitionsList.add(s46t1);
        s46 = new State("s46", "NH", s46transitionsList);
  
        s47t1 =  new Transition("s48", 'N', '1', "right");
        s47transitionsList.add(s47t1);
        s47 = new State("s47", "NH", s47transitionsList);
  
        s48t1 =  new Transition("s49", 'N', '1', "right");
        s48transitionsList.add(s48t1);
        s48 = new State("s48", "NH", s48transitionsList);
  
        s49t1 =  new Transition("s50", 'N', '1', "right");
        s49transitionsList.add(s49t1);
        s49 = new State("s49", "NH", s49transitionsList);
  
        s50t1 =  new Transition("s51", 'N', '1', "right");
        s50transitionsList.add(s50t1);
        s50 = new State("s50", "NH", s50transitionsList);
  
        s51t1 =  new Transition("s52", 'N', '1', "right");
        s51transitionsList.add(s51t1);
        s51 = new State("s51", "NH", s51transitionsList);
  
        s52t1 =  new Transition("s53", 'N', '1', "right");
        s52transitionsList.add(s52t1);
        s52 = new State("s52", "NH", s52transitionsList);

        s53t1 =  new Transition("s54", 'N', '1', "right");
        s53transitionsList.add(s53t1);
        s53 = new State("s53", "NH", s53transitionsList);
  
        s54t1 =  new Transition("s55", 'N', '1', "right");
        s54transitionsList.add(s54t1);
        s54 = new State("s54", "NH", s54transitionsList);
  
        s55t1 =  new Transition("s56", 'N', '1', "right");
        s55transitionsList.add(s55t1);
        s55 = new State("s55", "NH", s55transitionsList);
  
        s56t1 =  new Transition("s57", 'N', '1', "right");
        s56transitionsList.add(s56t1);
        s56 = new State("s56", "NH", s56transitionsList);
  
        s57t1 =  new Transition("s58", 'N', '1', "right");
        s57transitionsList.add(s57t1);
        s57 = new State("s57", "NH", s57transitionsList);
  
        s58t1 =  new Transition("s59", 'N', '1', "right");
        s58transitionsList.add(s58t1);
        s58 = new State("s58", "NH", s58transitionsList);
  
        s59t1 =  new Transition("s60", 'N', '1', "right");
        s59transitionsList.add(s59t1);
        s59 = new State("s59", "NH", s59transitionsList);
  
        s60t1 =  new Transition("s61", 'N', '1', "right");
        s60transitionsList.add(s60t1);
        s60 = new State("s60", "NH", s60transitionsList);
  
        s61t1 =  new Transition("s62", 'N', '1', "right");
        s61transitionsList.add(s61t1);
        s61 = new State("s61", "NH", s61transitionsList);
  
        s62t1 =  new Transition("s63", 'N', '1', "right");
        s62transitionsList.add(s62t1);
        s62 = new State("s62", "NH", s62transitionsList);
  
        s63t1 =  new Transition("s64", 'N', '1', "right");
        s63transitionsList.add(s63t1);
        s63 = new State("s63", "NH", s63transitionsList);
  
        s64t1 =  new Transition("s65", 'N', '1', "right");
        s64transitionsList.add(s64t1);
        s64 = new State("s64", "NH", s64transitionsList);
  
        s65t1 =  new Transition("s66", 'N', '1', "right");
        s65transitionsList.add(s65t1);
        s65 = new State("s65", "NH", s65transitionsList);
  
        s66t1 =  new Transition("s67", 'N', '1', "right");
        s66transitionsList.add(s66t1);
        s66 = new State("s66", "NH", s66transitionsList);
  
        s67t1 =  new Transition("s68", 'N', '1', "right");
        s67transitionsList.add(s67t1);
        s67 = new State("s67", "NH", s67transitionsList);
  
        s68t1 =  new Transition("s69", 'N', '1', "right");
        s68transitionsList.add(s68t1);
        s68 = new State("s68", "NH", s68transitionsList);
  
        s69t1 =  new Transition("s70", 'N', '1', "right");
        s69transitionsList.add(s69t1);
        s69 = new State("s69", "NH", s69transitionsList);
  
        s70t1 =  new Transition("s71", 'N', '1', "right");
        s70transitionsList.add(s70t1);
        s70 = new State("s70", "NH", s70transitionsList);
  
        s71t1 =  new Transition("s72", 'N', '1', "right");
        s71transitionsList.add(s71t1);
        s71 = new State("s71", "NH", s71transitionsList);
  
        s72t1 =  new Transition("s73", 'N', '1', "right");
        s72transitionsList.add(s72t1);
        s72 = new State("s72", "NH", s72transitionsList);
  
        s73t1 =  new Transition("s74", 'N', '1', "right");
        s73transitionsList.add(s73t1);
        s73 = new State("s73", "NH", s73transitionsList);
  
        s74t1 =  new Transition("s75", 'N', '1', "right");
        s74transitionsList.add(s74t1);
        s74 = new State("s74", "NH", s74transitionsList);
  
        s75t1 =  new Transition("s76", 'N', '1', "right");
        s75transitionsList.add(s75t1);
        s75 = new State("s75", "NH", s75transitionsList);
  
        s76t1 =  new Transition("s77", 'N', '1', "right");
        s76transitionsList.add(s76t1);
        s76 = new State("s76", "NH", s76transitionsList);
  
        s77t1 =  new Transition("s78", 'N', '1', "right");
        s77transitionsList.add(s77t1);
        s77 = new State("s77", "NH", s77transitionsList);
  
        s78t1 =  new Transition("s79", 'N', '1', "right");
        s78transitionsList.add(s78t1);
        s78 = new State("s78", "NH", s78transitionsList);
  
        s79t1 =  new Transition("s80", 'N', '1', "right");
        s79transitionsList.add(s79t1);
        s79 = new State("s79", "NH", s79transitionsList);
  
        s80t1 =  new Transition("s81", 'N', '1', "right");
        s80transitionsList.add(s80t1);
        s80 = new State("s80", "NH", s80transitionsList);
  
        s81t1 =  new Transition("s82", 'N', '1', "right");
        s81transitionsList.add(s81t1);
        s81 = new State("s81", "NH", s81transitionsList);
  
        s82t1 =  new Transition("s83", 'N', '1', "right");
        s82transitionsList.add(s82t1);
        s82 = new State("s82", "NH", s82transitionsList);
  
        s83t1 =  new Transition("s84", 'N', '1', "right");
        s83transitionsList.add(s83t1);
        s83 = new State("s83", "NH", s83transitionsList);
  
        s84t1 =  new Transition("s85", 'N', '1', "right");
        s84transitionsList.add(s84t1);
        s84 = new State("s84", "NH", s84transitionsList);
  
        s85t1 =  new Transition("s86", 'N', '1', "right");
        s85transitionsList.add(s85t1);
        s85 = new State("s85", "NH", s85transitionsList);
  
        s86t1 =  new Transition("s87", 'N', '1', "right");
        s86transitionsList.add(s86t1);
        s86 = new State("s86", "NH", s86transitionsList);
  
        s87t1 =  new Transition("s88", 'N', '1', "right");
        s87transitionsList.add(s87t1);
        s87 = new State("s87", "NH", s87transitionsList);
  
        s88t1 =  new Transition("s89", 'N', '1', "right");
        s88transitionsList.add(s88t1);
        s88 = new State("s88", "NH", s88transitionsList);
  
        s89t1 =  new Transition("s90", 'N', '1', "right");
        s89transitionsList.add(s89t1);
        s89 = new State("s89", "NH", s89transitionsList);
  
        s90t1 =  new Transition("s91", 'N', '1', "right");
        s90transitionsList.add(s90t1);
        s90 = new State("s90", "NH", s90transitionsList);
  
        s91t1 =  new Transition("s92", 'N', '1', "right");
        s91transitionsList.add(s91t1);
        s91 = new State("s91", "NH", s91transitionsList);
  
        s92t1 =  new Transition("s93", 'N', '1', "right");
        s92transitionsList.add(s92t1);
        s92 = new State("s92", "NH", s92transitionsList);
  
        s93t1 =  new Transition("s94", 'N', '1', "right");
        s93transitionsList.add(s93t1);
        s93 = new State("s93", "NH", s93transitionsList);
  
        s94t1 =  new Transition("s95", 'N', '1', "right");
        s94transitionsList.add(s94t1);
        s94 = new State("s94", "NH", s94transitionsList);
  
        s95t1 =  new Transition("s96", 'N', '1', "right");
        s95transitionsList.add(s95t1);
        s95 = new State("s95", "NH", s95transitionsList);
  
        s95t1 =  new Transition("s96", 'N', '1', "right");
        s95transitionsList.add(s95t1);
        s95 = new State("s95", "NH", s95transitionsList);
  
        s96t1 =  new Transition("s97", 'N', '1', "right");
        s96transitionsList.add(s96t1);
        s96 = new State("s96", "NH", s96transitionsList);
  
        s97t1 =  new Transition("s98", 'N', '1', "right");
        s97transitionsList.add(s97t1);
        s97 = new State("s97", "NH", s97transitionsList);
  
        s98t1 =  new Transition("s99", 'N', '1', "right");
        s98transitionsList.add(s98t1);
        s98 = new State("s98", "NH", s98transitionsList);
  
        s99t1 =  new Transition("s100", 'N', '1', "right");
        s99transitionsList.add(s99t1);
        s99 = new State("s99", "NH", s99transitionsList);
  
        s100t1 =  new Transition("s101", 'N', '1', "right");
        s100transitionsList.add(s100t1);
        s100 = new State("s100", "NH", s100transitionsList);
  
        s101t1 =  new Transition("s102", 'N', '1', "right");
        s101transitionsList.add(s101t1);
        s101 = new State("s101", "NH", s101transitionsList);
  
        s102t1 =  new Transition("s103", 'N', '1', "right");
        s102transitionsList.add(s102t1);
        s102 = new State("s102", "NH", s102transitionsList);
  
        s103t1 =  new Transition("s104", 'N', '1', "right");
        s103transitionsList.add(s103t1);
        s103 = new State("s103", "NH", s103transitionsList);
  
        s104t1 =  new Transition("s105", 'N', '1', "right");
        s104transitionsList.add(s104t1);
        s104 = new State("s104", "NH", s104transitionsList);
  
        s105t1 =  new Transition("s106", 'N', '1', "right");
        s105transitionsList.add(s105t1);
        s105 = new State("s105", "NH", s105transitionsList);
  
        s106t1 =  new Transition("s107", 'N', '1', "right");
        s106transitionsList.add(s106t1);
        s106 = new State("s106", "NH", s106transitionsList);
  
        s107t1 =  new Transition("s108", 'N', '1', "right");
        s107transitionsList.add(s107t1);
        s107 = new State("s107", "NH", s107transitionsList);
  
        s108t1 =  new Transition("s109", 'N', '1', "right");
        s108transitionsList.add(s108t1);
        s108 = new State("s108", "NH", s108transitionsList);
  
        s109t1 =  new Transition("s110", 'N', '1', "right");
        s109transitionsList.add(s109t1);
        s109 = new State("s109", "NH", s109transitionsList);
  
        s110t1 =  new Transition("s111", 'N', '1', "right");
        s110transitionsList.add(s110t1);
        s110 = new State("s110", "NH", s110transitionsList);
  
        s111t1 =  new Transition("s112", 'N', '1', "right");
        s111transitionsList.add(s111t1);
        s111 = new State("s111", "NH", s111transitionsList);
  
        s41t1 =  new Transition("s42", 'N', '1', "right");
        s41transitionsList.add(s41t1);
        s41 = new State("s41", "NH", s41transitionsList);

        s40t1 =  new Transition("s41", 'N', '1', "right");
        s40transitionsList.add(s40t1);
        s40 = new State("s40", "NH", s40transitionsList);

        s39t1 =  new Transition("s40", 'N', '1', "right");
        s39transitionsList.add(s39t1);
        s39 = new State("s39", "NH", s39transitionsList);

        s38t1 =  new Transition("s39", 'N', '1', "right");
        s38transitionsList.add(s38t1);
        s38 = new State("s38", "NH", s38transitionsList);
          
        s37t1 =  new Transition("s38", 'N', '1', "right");
        s37transitionsList.add(s37t1);
        s37 = new State("s37", "NH", s37transitionsList);

       s36t1 =  new Transition("s37", 'N', '1', "right");
       s36transitionsList.add(s36t1);
       s36 = new State("s36", "NH", s36transitionsList);
         
       s35t1 =  new Transition("s36", 'N', '1', "right");
       s35transitionsList.add(s35t1);
       s35 = new State("s35", "NH", s35transitionsList);

        s34t1 =  new Transition("s35", 'N', '1', "right");
        s34transitionsList.add(s34t1);
        s34 = new State("s34", "NH", s34transitionsList);

       s33t1 =  new Transition("s34", 'N', '1', "right");
       s33transitionsList.add(s33t1);
       s33 = new State("s33", "NH", s33transitionsList);

        s32t1 =  new Transition("s33", 'N', '1', "right");
        s32transitionsList.add(s32t1);
        s32 = new State("s32", "NH", s32transitionsList);

        s31t1 =  new Transition("s32", 'N', '1', "right");
        s31transitionsList.add(s31t1);
        s31 = new State("s31", "NH", s31transitionsList);
 
       s30t1 =  new Transition("s31", 'N', '1', "right");
       s30transitionsList.add(s30t1);
       s30 = new State("s30", "NH", s30transitionsList);

        s29t1 =  new Transition("s30", 'N', '1', "right");
        s29transitionsList.add(s29t1);
        s29 = new State("s29", "NH", s29transitionsList);

        s28t1 =  new Transition("s29", 'N', '1', "right");
        s28transitionsList.add(s28t1);
        s28 = new State("s28", "NH", s28transitionsList);

        s27t1 =  new Transition("s28", 'N', '1', "right");
        s27transitionsList.add(s27t1);
        s27 = new State("s27", "NH", s27transitionsList);

        s26t1 =  new Transition("s27", 'N', '1', "right");
        s26transitionsList.add(s26t1);
        s26 = new State("s26", "NH", s26transitionsList);

        s25t1 =  new Transition("s26", 'N', '1', "right");
        s25transitionsList.add(s25t1);
        s25 = new State("s25", "NH", s25transitionsList);


        s24t1 =  new Transition("s25", 'N', '1', "right");
        s24transitionsList.add(s24t1);
        s24 = new State("s24", "NH", s24transitionsList);

        s23t1 =  new Transition("s24", 'N', '1', "right");
        s23transitionsList.add(s23t1);
        s23 = new State("s23", "NH", s23transitionsList);

        s22t1 =  new Transition("s23", 'N', '1', "right");
       s22transitionsList.add(s22t1);
       s22 = new State("s22", "NH", s22transitionsList);

        s21t1 =  new Transition("s22", 'N', '1', "right");
        s21transitionsList.add(s21t1);
        s21 = new State("s21", "NH", s21transitionsList);

        s20t1 =  new Transition("s21", 'N', '1', "right");
        s20transitionsList.add(s20t1);
        s20 = new State("s20", "NH", s20transitionsList);

        s19t1 =  new Transition("s20", 'N', '1', "right");
        s19transitionsList.add(s19t1);
        s19 = new State("s19", "NH", s19transitionsList);

        s18t1 =  new Transition("s19", 'N', '1', "right");
        s18transitionsList.add(s18t1);
        s18 = new State("s18", "NH", s18transitionsList);

        s17t1 =  new Transition("s18", 'N', '1', "right");
        s17transitionsList.add(s17t1);
        s17 = new State("s10", "NH", s17transitionsList);

        s16t1 =  new Transition("s17", 'N', '1', "right");
        s16transitionsList.add(s16t1);
        s16 = new State("s16", "NH", s17transitionsList);

        s15t1 =  new Transition("s16", 'N', '1', "right");
        s15transitionsList.add(s15t1);
        s15 = new State("s15", "NH", s15transitionsList);

        s14t1 =  new Transition("s15", 'N', '1', "right");
        s14transitionsList.add(s14t1);
        s14 = new State("s14", "NH", s14transitionsList);

        s13t1 =  new Transition("s14", 'N', '1', "right");
        s13transitionsList.add(s13t1);
        s13 = new State("s13", "NH", s13transitionsList);

        s12t1 =  new Transition("s13", 'N', '1', "right");
        s12transitionsList.add(s12t1);
        s12 = new State("s12", "NH", s12transitionsList);

        s11t1 =  new Transition("s12", 'N', '1', "right");
        s11transitionsList.add(s11t1);
        s11 = new State("s11", "NH", s11transitionsList);

        s10t1 =  new Transition("s11", 'N', '1', "right");
        s10transitionsList.add(s10t1);
        s10 = new State("s10", "NH", s10transitionsList);

        s9t1 =  new Transition("s10", 'N', '1', "right");
        s9transitionsList.add(s9t1);
        s9 = new State("s9", "NH", s9transitionsList);

        s8t1 =  new Transition("s9", 'N', '1', "right");
        s8transitionsList.add(s8t1);
        s8 = new State("s8", "NH", s8transitionsList);

        s3t1 =  new Transition("s8", 'N', '1', "right");
        s3transitionsList.add(s3t1);
        s3 = new State("s3", "NH", s3transitionsList);

        s2t1 =  new Transition("s3", 'N', '1', "right");
        s2transitionsList.add(s2t1);
        s2 = new State("s2", "NH", s2transitionsList);

        s1t1 = new Transition("s1", '2', '2', "right");
        s1t2 = new Transition("s1", '1', '1', "right");
        s1t3 = new Transition("s2", 'N', '1', "right");
        s1transitionsList.add(s1t1);
        s1transitionsList.add(s1t2);
        s1transitionsList.add(s1t3);
        s1 = new State("s1", "NH", s1transitionsList);

        s0t1 = new Transition("s1", '2', '1', "right");
        s0transitionsList.add(s0t1);
        s0 = new State("s0", "NH", s0transitionsList);

        statesList.add(s0);
        statesList.add(s1);
        statesList.add(s2);
        statesList.add(s3);
        statesList.add(s4);
        statesList.add(s5);
        statesList.add(s6);
        statesList.add(s7);
        statesList.add(s8);
        statesList.add(s9);
        statesList.add(s10);
        statesList.add(s11);
        statesList.add(s12);
        statesList.add(s13);
        statesList.add(s14);
        statesList.add(s15);
        statesList.add(s16);
        statesList.add(s17);
        statesList.add(s18);
        statesList.add(s19);
        statesList.add(s20);
        statesList.add(s21);
        statesList.add(s22);
        statesList.add(s23);
        statesList.add(s24);
        statesList.add(s25);
        statesList.add(s26);
        statesList.add(s27);
        statesList.add(s28);
        statesList.add(s29);
        statesList.add(s30);
        statesList.add(s31);
        statesList.add(s32);
        statesList.add(s33);
        statesList.add(s34);
        statesList.add(s35);
        statesList.add(s36);
        statesList.add(s37);
        statesList.add(s38);
        statesList.add(s39);
        statesList.add(s40);
        statesList.add(s41);
        statesList.add(s42);
        statesList.add(s43);
        statesList.add(s44);
        statesList.add(s45);
        statesList.add(s46);
        statesList.add(s47);
        statesList.add(s48);
        statesList.add(s49);
        statesList.add(s50);
        statesList.add(s51);
        statesList.add(s52);
        statesList.add(s53);
        statesList.add(s54);
        statesList.add(s55);
        statesList.add(s56);
        statesList.add(s57);
        statesList.add(s58);
        statesList.add(s59);
        statesList.add(s60);
        statesList.add(s61);
        statesList.add(s62);
        statesList.add(s63);
        statesList.add(s64);
        statesList.add(s65);
        statesList.add(s66);
        statesList.add(s67);
        statesList.add(s68);
        statesList.add(s69);
        statesList.add(s70);
        statesList.add(s71);
        statesList.add(s72);
        statesList.add(s73);
        statesList.add(s74);
        statesList.add(s75);
        statesList.add(s76);
        statesList.add(s77);
        statesList.add(s78);
        statesList.add(s79);
        statesList.add(s80);
        statesList.add(s81);
        statesList.add(s82);
        statesList.add(s83);
        statesList.add(s84);
        statesList.add(s85);
        statesList.add(s86);
        statesList.add(s87);
        statesList.add(s88);
        statesList.add(s89);
        statesList.add(s90);
        statesList.add(s91);
        statesList.add(s92);
        statesList.add(s93);
        statesList.add(s94);
        statesList.add(s95);
        statesList.add(s96);
        statesList.add(s97);
        statesList.add(s98);
        statesList.add(s99);
        statesList.add(s100);
        statesList.add(s101);
        statesList.add(s102);
        statesList.add(s103);
        statesList.add(s104);
        statesList.add(s105);
        statesList.add(s106);
        statesList.add(s107);
        statesList.add(s108);
        statesList.add(s109);
        statesList.add(s110);
        statesList.add(s111);
        statesList.add(s112);

        turingTest = new StateMachine(statesList, s0, input);
        turingTest.dealWithTape();
    }
}