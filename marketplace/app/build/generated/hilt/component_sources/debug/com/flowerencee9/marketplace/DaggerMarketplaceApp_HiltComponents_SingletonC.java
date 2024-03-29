package com.flowerencee9.marketplace;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.flowerencee9.marketplace.model.networking.networkingsupport.Injection;
import com.flowerencee9.marketplace.model.networking.networkingsupport.Injection_ProvideAuthFactory;
import com.flowerencee9.marketplace.model.networking.networkingsupport.Injection_ProvideExploreFactory;
import com.flowerencee9.marketplace.model.networking.networkingsupport.Injection_ProvideMainFactory;
import com.flowerencee9.marketplace.model.networking.networkingsupport.Injection_ProvideTransactionFactory;
import com.flowerencee9.marketplace.model.networking.networkingsupport.Injection_ProvideUserFactory;
import com.flowerencee9.marketplace.model.networking.repositories.AuthRepository;
import com.flowerencee9.marketplace.model.networking.repositories.ExploreRepository;
import com.flowerencee9.marketplace.model.networking.repositories.MainRepository;
import com.flowerencee9.marketplace.model.networking.repositories.TransactionRepository;
import com.flowerencee9.marketplace.model.networking.repositories.UserRepository;
import com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordViewModel;
import com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.auth.forgotpassword.ForgotPasswordViewModel;
import com.flowerencee9.marketplace.screens.auth.forgotpassword.ForgotPasswordViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.auth.login.LoginViewModel;
import com.flowerencee9.marketplace.screens.auth.login.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.auth.otp.OtpViewModel;
import com.flowerencee9.marketplace.screens.auth.otp.OtpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.auth.register.RegisterViewModel;
import com.flowerencee9.marketplace.screens.auth.register.RegisterViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.main.MainActivity;
import com.flowerencee9.marketplace.screens.main.MainViewModel;
import com.flowerencee9.marketplace.screens.main.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.main.account.AccountViewModel;
import com.flowerencee9.marketplace.screens.main.account.AccountViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.main.cart.CartFragment;
import com.flowerencee9.marketplace.screens.main.explore.ExploreFragment;
import com.flowerencee9.marketplace.screens.main.explore.ExploreViewModel;
import com.flowerencee9.marketplace.screens.main.explore.ExploreViewModel_HiltModules_KeyModule_ProvideFactory;
import com.flowerencee9.marketplace.screens.main.summary.SummaryViewModel;
import com.flowerencee9.marketplace.screens.main.summary.SummaryViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMarketplaceApp_HiltComponents_SingletonC {
  private DaggerMarketplaceApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder injection(Injection injection) {
      Preconditions.checkNotNull(injection);
      return this;
    }

    public MarketplaceApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MarketplaceApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public MarketplaceApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements MarketplaceApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MarketplaceApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MarketplaceApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MarketplaceApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MarketplaceApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MarketplaceApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MarketplaceApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MarketplaceApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MarketplaceApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public MarketplaceApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements MarketplaceApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MarketplaceApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MarketplaceApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MarketplaceApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectCartFragment(CartFragment cartFragment) {
    }

    @Override
    public void injectExploreFragment(ExploreFragment exploreFragment) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MarketplaceApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MarketplaceApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(9).add(AccountViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(CreatePasswordViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ExploreViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ForgotPasswordViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(OtpViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RegisterViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SummaryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends MarketplaceApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AccountViewModel> accountViewModelProvider;

    private Provider<CreatePasswordViewModel> createPasswordViewModelProvider;

    private Provider<ExploreViewModel> exploreViewModelProvider;

    private Provider<ForgotPasswordViewModel> forgotPasswordViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<OtpViewModel> otpViewModelProvider;

    private Provider<RegisterViewModel> registerViewModelProvider;

    private Provider<SummaryViewModel> summaryViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.accountViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.createPasswordViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.exploreViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.forgotPasswordViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.otpViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.registerViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.summaryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(9).put("com.flowerencee9.marketplace.screens.main.account.AccountViewModel", ((Provider) accountViewModelProvider)).put("com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordViewModel", ((Provider) createPasswordViewModelProvider)).put("com.flowerencee9.marketplace.screens.main.explore.ExploreViewModel", ((Provider) exploreViewModelProvider)).put("com.flowerencee9.marketplace.screens.auth.forgotpassword.ForgotPasswordViewModel", ((Provider) forgotPasswordViewModelProvider)).put("com.flowerencee9.marketplace.screens.auth.login.LoginViewModel", ((Provider) loginViewModelProvider)).put("com.flowerencee9.marketplace.screens.main.MainViewModel", ((Provider) mainViewModelProvider)).put("com.flowerencee9.marketplace.screens.auth.otp.OtpViewModel", ((Provider) otpViewModelProvider)).put("com.flowerencee9.marketplace.screens.auth.register.RegisterViewModel", ((Provider) registerViewModelProvider)).put("com.flowerencee9.marketplace.screens.main.summary.SummaryViewModel", ((Provider) summaryViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.flowerencee9.marketplace.screens.main.account.AccountViewModel 
          return (T) new AccountViewModel(singletonCImpl.userRepository());

          case 1: // com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordViewModel 
          return (T) new CreatePasswordViewModel(singletonCImpl.authRepository());

          case 2: // com.flowerencee9.marketplace.screens.main.explore.ExploreViewModel 
          return (T) new ExploreViewModel(singletonCImpl.exploreRepository());

          case 3: // com.flowerencee9.marketplace.screens.auth.forgotpassword.ForgotPasswordViewModel 
          return (T) new ForgotPasswordViewModel(singletonCImpl.authRepository());

          case 4: // com.flowerencee9.marketplace.screens.auth.login.LoginViewModel 
          return (T) new LoginViewModel(singletonCImpl.authRepository());

          case 5: // com.flowerencee9.marketplace.screens.main.MainViewModel 
          return (T) new MainViewModel(singletonCImpl.mainRepository());

          case 6: // com.flowerencee9.marketplace.screens.auth.otp.OtpViewModel 
          return (T) new OtpViewModel(singletonCImpl.authRepository());

          case 7: // com.flowerencee9.marketplace.screens.auth.register.RegisterViewModel 
          return (T) new RegisterViewModel(singletonCImpl.authRepository());

          case 8: // com.flowerencee9.marketplace.screens.main.summary.SummaryViewModel 
          return (T) new SummaryViewModel(singletonCImpl.transactionRepository());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MarketplaceApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MarketplaceApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends MarketplaceApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;

    }

    private UserRepository userRepository() {
      return Injection_ProvideUserFactory.provideUser(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private AuthRepository authRepository() {
      return Injection_ProvideAuthFactory.provideAuth(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private ExploreRepository exploreRepository() {
      return Injection_ProvideExploreFactory.provideExplore(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private MainRepository mainRepository() {
      return Injection_ProvideMainFactory.provideMain(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private TransactionRepository transactionRepository() {
      return Injection_ProvideTransactionFactory.provideTransaction(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    @Override
    public void injectMarketplaceApp(MarketplaceApp marketplaceApp) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }
  }
}
