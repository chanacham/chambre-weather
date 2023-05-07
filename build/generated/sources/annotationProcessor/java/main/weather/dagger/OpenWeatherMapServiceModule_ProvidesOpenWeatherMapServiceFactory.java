package weather.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import weather.WeatherService;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class OpenWeatherMapServiceModule_ProvidesOpenWeatherMapServiceFactory implements Factory<WeatherService> {
  private final OpenWeatherMapServiceModule module;

  public OpenWeatherMapServiceModule_ProvidesOpenWeatherMapServiceFactory(
      OpenWeatherMapServiceModule module) {
    this.module = module;
  }

  @Override
  public WeatherService get() {
    return providesOpenWeatherMapService(module);
  }

  public static OpenWeatherMapServiceModule_ProvidesOpenWeatherMapServiceFactory create(
      OpenWeatherMapServiceModule module) {
    return new OpenWeatherMapServiceModule_ProvidesOpenWeatherMapServiceFactory(module);
  }

  public static WeatherService providesOpenWeatherMapService(OpenWeatherMapServiceModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesOpenWeatherMapService());
  }
}
