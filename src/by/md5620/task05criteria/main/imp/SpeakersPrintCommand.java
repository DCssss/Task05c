package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.Speakers;
import by.md5620.task05criteria.main.PrintCommand;

public class SpeakersPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;

        String output = "Speakers: " +
                "powerConsumption=" + speakers.getPowerConsumption() +
                ", numOfSpeakers=" + speakers.getNumOfSpeakers() +
                ", frequencyRange='" + speakers.getFrequencyRange() +
                ", cordLength=" + speakers.getCordLength();

        System.out.println(output);
    }
}
