@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
        name = "portfolio_security",
        joinColumns = @JoinColumn(name = "portfolio_id"),
        inverseJoinColumns = @JoinColumn(name = "security_id")
    )
    private List<Security> securities;

    public Portfolio(Long id, Client client,
                     List<Security> securities) {
        this.id = id;
        this.client = client;
        this.securities = securities;
    }

    public Portfolio() {}

    public Long getId() { return id; }

    public Client getClient() { return client; }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}