package sqlapplication.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import sqlapplication.data.Melodii;
import sqlapplication.data.MelodiiRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final MelodiiRepository melodiiRepository;
    public AppStartupEvent(MelodiiRepository melodiiRepository) {
        this.melodiiRepository = melodiiRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Melodii> melodii = this.melodiiRepository.findAll();
        melodii.forEach(System.out::println);
    }
}
