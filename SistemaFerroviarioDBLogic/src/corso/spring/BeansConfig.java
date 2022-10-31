package corso.spring;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration 
@EnableTransactionManagement
public class BeansConfig {
	
	@Bean(name="dataSource")
	public DataSource getDataSource () {
		System.out.println("Connessione al DB...");
		
		DriverManagerDataSource ds = new DriverManagerDataSource(); 
		
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("Microice98");
		ds.setUrl("jdbc:mariadb://localhost:3306/sistemaferroviariodb");
		
		return ds; 
	}
	
	@Bean
    public LocalContainerEntityManagerFactoryBean  getEntityManager(){
    	 LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
    	 
    	 // factory.setValidationMode(ValidationMode.AUTO);
    	 
    	 // JDBC
    	 factory.setDataSource(getDataSource());  
    	 
    	 // imposta il dialogo tra JPA e hibernate
    	 factory.setJpaVendorAdapter(getJpaVendorAdapter()); // imposta il dialogo tra JPA e hibernate
    	 
    	 // impostare il luogo dove si trovano i bean
    	 factory.setPackagesToScan("corso.model");
    	 // oppure "com.corso.spring...." al posto di this.getClass().getPackage().getName()
    	 return factory; 
    } 	
	
	private HibernateJpaVendorAdapter getJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);   // obbligatorio: serve per tradurre le query nel particolare Dialetto
		
		adapter.setGenerateDdl(true);          //facoltativo, attiva il DDL: hibernate creerà le strutture nel DB se non sono già essitenti
		adapter.setShowSql(true);              // mostra l'SQL, comodo per i corsi e per il debug ma in produzione solitamente a false
		return adapter;
	}	
	
		
	/*** transazioni ***/
	@Bean
	public PlatformTransactionManager getTransactionManager(){
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(getEntityManager().getObject());
	      //transactionManager.setNestedTransactionAllowed(false);
	      return transactionManager;
	}
}
