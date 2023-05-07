package weather.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import weather.ForecastWeatherController;
import weather.ForecastWeatherFrame;
import weather.ForecastWeatherView;
import weather.ForecastWeatherView_Factory;

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
public final class DaggerForecastWeatherComponent {
  private DaggerForecastWeatherComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ForecastWeatherComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private OpenWeatherMapServiceModule openWeatherMapServiceModule;

    private Builder() {
    }

    public Builder openWeatherMapServiceModule(
        OpenWeatherMapServiceModule openWeatherMapServiceModule) {
      this.openWeatherMapServiceModule = Preconditions.checkNotNull(openWeatherMapServiceModule);
      return this;
    }

    public ForecastWeatherComponent build() {
      if (openWeatherMapServiceModule == null) {
        this.openWeatherMapServiceModule = new OpenWeatherMapServiceModule();
      }
      return new ForecastWeatherComponentImpl(openWeatherMapServiceModule);
    }
  }

  private static final class ForecastWeatherComponentImpl implements ForecastWeatherComponent {
    private final OpenWeatherMapServiceModule openWeatherMapServiceModule;

    private final ForecastWeatherComponentImpl forecastWeatherComponentImpl = this;

    private Provider<ForecastWeatherView> forecastWeatherViewProvider;

    private ForecastWeatherComponentImpl(
        OpenWeatherMapServiceModule openWeatherMapServiceModuleParam) {
      this.openWeatherMapServiceModule = openWeatherMapServiceModuleParam;
      initialize(openWeatherMapServiceModuleParam);

    }

    private ForecastWeatherController forecastWeatherController() {
      return new ForecastWeatherController(forecastWeatherViewProvider.get(), OpenWeatherMapServiceModule_ProvidesOpenWeatherMapServiceFactory.providesOpenWeatherMapService(openWeatherMapServiceModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final OpenWeatherMapServiceModule openWeatherMapServiceModuleParam) {
      this.forecastWeatherViewProvider = DoubleCheck.provider(ForecastWeatherView_Factory.create());
    }

    @Override
    public ForecastWeatherFrame providesForecastWeatherFrame() {
      return new ForecastWeatherFrame(forecastWeatherViewProvider.get(), forecastWeatherController());
    }
  }
}
