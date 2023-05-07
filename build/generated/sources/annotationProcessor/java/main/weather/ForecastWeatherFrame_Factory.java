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
public final class ForecastWeatherFrame_Factory implements Factory<ForecastWeatherFrame> {
  private final Provider<ForecastWeatherView> viewProvider;

  private final Provider<ForecastWeatherController> controllerProvider;

  public ForecastWeatherFrame_Factory(Provider<ForecastWeatherView> viewProvider,
      Provider<ForecastWeatherController> controllerProvider) {
    this.viewProvider = viewProvider;
    this.controllerProvider = controllerProvider;
  }

  @Override
  public ForecastWeatherFrame get() {
    return newInstance(viewProvider.get(), controllerProvider.get());
  }

  public static ForecastWeatherFrame_Factory create(Provider<ForecastWeatherView> viewProvider,
      Provider<ForecastWeatherController> controllerProvider) {
    return new ForecastWeatherFrame_Factory(viewProvider, controllerProvider);
  }

  public static ForecastWeatherFrame newInstance(ForecastWeatherView view,
      ForecastWeatherController controller) {
    return new ForecastWeatherFrame(view, controller);
  }
}
