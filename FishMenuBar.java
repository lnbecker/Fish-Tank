import javax.swing.*;

@SuppressWarnings("serial")
public class FishMenuBar extends JMenuBar {
   
   public FishMenuBar(FishPanel fp) {  // set up the menu bar
      JMenu animation = new JMenu("Animation");
      add(animation);
   		JMenuItem startstop = new JMenuItem("Stop");
      animation.add(startstop);
      startstop.addActionListener(e->{
      		fp.toggleSuspend();
      		String label = startstop.getText();
      		String newlabel = label.equals("Start") ? "Stop" : "Start";
      		startstop.setText(newlabel);
      });
      
      JMenu newmenu = new JMenu("New Fish");
      add(newmenu);
      JMenuItem angelfish = new JMenuItem("Angel Fish");
      newmenu.add(angelfish);
      angelfish.addActionListener(e->newFish(fp, angelfish.getText()));
      JMenuItem meanie = new JMenuItem("Mean Fish");
      newmenu.add(meanie);
      meanie.addActionListener(e->newFish(fp, meanie.getText()));
      JMenuItem octopus = new JMenuItem("Octopus");
      newmenu.add(octopus);
      octopus.addActionListener(e->newFish(fp, octopus.getText()));  
      JMenuItem pokeyfish = new JMenuItem("Pokey Fish");
      newmenu.add(pokeyfish);
      pokeyfish.addActionListener(e->newFish(fp, pokeyfish.getText()));
      JMenuItem shark = new JMenuItem("Shark");
      newmenu.add(shark);
      shark.addActionListener(e->newFish(fp, shark.getText()));
      JMenuItem yellowfish = new JMenuItem("Yellow Fish");
      newmenu.add(yellowfish);
      yellowfish.addActionListener(e->newFish(fp, yellowfish.getText()));
      JMenuItem dolphin = new JMenuItem("Dolphin");
      newmenu.add(dolphin);
      dolphin.addActionListener(e->newFish(fp, dolphin.getText()));
      JMenuItem tropfish = new JMenuItem("Tropical Fish");
      newmenu.add(tropfish);
      tropfish.addActionListener(e->newFish(fp, tropfish.getText()));
      JMenuItem pufferfish = new JMenuItem("Pufferfish");
      newmenu.add(pufferfish);
      pufferfish.addActionListener(e->newFish(fp, pufferfish.getText()));
   }
   
	private void newFish(FishPanel fp, String fishtype) {
		FishFactory myFactory = FishFactory.getFactory(fishtype);
		Fish fish = myFactory.create();
		fp.addFish(fish);
	}
}
