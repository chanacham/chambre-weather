package weather;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ForecastWeatherController_Factory implements Factory<ForecastWeatherController> {
  private final Provider<ForecastWeatherView> viewProvider;

  private final Provider<WeatherService> serviceProvider;

  public ForecastWeatherController_Factory(Provider<ForecastWeatherView> viewProvider,
      Provider<WeatherService> serviceProvider) {
    this.viewProvider = viewProvider;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ForecastWeatherController get() {
    return newInstance(viewProvider.get(), serviceProvider.get());
  }

  public static ForecastWeatherController_Factory create(Provider<ForecastWeatherView> viewProvider,
      Provider<WeatherService> serviceProvider) {
    return new ForecastWeatherController_Factory(viewProvider, serviceProvider);
  }

  public static ForecastWeatherController newInstance(ForecastWeatherView view,
      WeatherService service) {
    return new ForecastWeatherController(view, service);
  }
}
