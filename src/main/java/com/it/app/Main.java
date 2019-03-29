package com.it.app;


import com.it.config.AppConfiguration;
import com.it.model.*;
import com.it.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Main {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TrainingTypesRepository trainingTypesRepository;
    @Autowired
    private TrainerRepository trainerRepository;
    @Autowired
    private Timeepository timeepository;
    @Autowired
    private SectionRepository sectionRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private GymRepository gymRepository;
    @Autowired
    private DayRepository dayRepository;
    @Autowired
    private DateTimeRepository dateTimeRepository;
    @Autowired
    private ClientRepository clientRepository;

    public static void main(String[] arguments) {
        AnnotationConfigApplicationContext annotatedClassApplicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Main main = annotatedClassApplicationContext.getBean("main", Main.class);
        createRoles(main,"Trainer");
        createRoles(main,"Client");
        Optional<Roles> roles1 = main.getRolesRepository().findById(1);
        Optional<Roles> roles2 = main.getRolesRepository().findById(2);
        createUser(main,roles1.get());
        createUser(main,roles2.get());
        Optional<User> user1 = main.getUserRepository().findById(1);
        Optional<User> user2 = main.getUserRepository().findById(2);
        createTrainingTypes(main,"Running");
        Optional<TrainingTypes>trainingTypes = main.getTrainingTypesRepository().findById(1);
        createGym(main,"New Address");
        Optional<Gym> gym = main.getGymRepository().findById(1);
        createDateTime(main,gym.get());
        createTrainer(main,trainingTypes.get(),user1.get());
        Optional<Trainer> trainer = main.getTrainerRepository().findById(1);
        createSection(main,gym.get(),trainer.get());

    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public TrainerRepository getTrainerRepository() {
        return trainerRepository;
    }

    public ClientRepository getClientRepository() {
        return clientRepository;
    }

    public SectionRepository getSectionRepository() {
        return sectionRepository;
    }

    public RolesRepository getRolesRepository(){return rolesRepository;}
    public TrainingTypesRepository getTrainingTypesRepository(){return trainingTypesRepository;}
    public GymRepository getGymRepository() {return gymRepository;}
    public DateTimeRepository getDateTimeRepository(){return dateTimeRepository;}

    public static void createUser(Main main, Roles roles) {
        User user = new User();
        user.setRoles(roles);
        user.setLogin("123");
        user.setPassword("123");
        user.setEmail("123@mail.ru");
        main.getUserRepository().save(user);
    }
  public static void createRoles(Main main,String string){
      Roles roles = new Roles();
      roles.setRoleName(string);
      main.getRolesRepository().save(roles);
  }
  public static void createTrainingTypes(Main main, String string){
      TrainingTypes trainingTypes = new TrainingTypes();
      trainingTypes.setTrainingName(string);
      main.getTrainingTypesRepository().save(trainingTypes);
  }
  public static void createGym(Main main,String string){
      Gym gym = new Gym();
      gym.setAddress(string);
      main.getGymRepository().save(gym);
  }
  public static void createDateTime(Main main, Gym gym){
      DateTime dateTime = new DateTime();
      dateTime.setGym(gym);
      main.getDateTimeRepository().save(dateTime);
  }

  public static void createSection(Main main,Gym gym,Trainer trainer){
        Section section = new Section();
        section.setGym(gym);
        section.setTrainer(trainer);
        main.getSectionRepository().save(section);
  }

  public static void createTrainer(Main main,TrainingTypes trainingTypes,User user){
        Trainer trainer = new Trainer();
        trainer.setTrainingTypes(trainingTypes);
        trainer.setUser(user);
        main.getTrainerRepository().save(trainer);
  }


}
