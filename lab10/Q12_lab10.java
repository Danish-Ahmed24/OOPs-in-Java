package lab10;

interface TradingEngine {
    void placeOrder();
    void runRiskChecks();

    static void generalTradingPolicy() {
        System.out.println("All trades must pass risk checks.");
    }
}

interface ComplianceEngine {
    void generateReport();
    void logAuditTrail();

    static void generalCompliancePolicy() {
        System.out.println("All trades must be reported and saved.");
    }
}

class AlgoTrader implements TradingEngine, ComplianceEngine {
    public void placeOrder() {
        System.out.println("AlgoTrader: Order placed automatically.");
    }

    public void runRiskChecks() {
        System.out.println("AlgoTrader: Risk checks done.");
    }

    public void generateReport() {
        System.out.println("AlgoTrader: Report created.");
    }

    public void logAuditTrail() {
        System.out.println("AlgoTrader: Audit saved.");
    }
}

class HumanTrader implements TradingEngine {
    public void placeOrder() {
        System.out.println("HumanTrader: Order placed by person.");
    }

    public void runRiskChecks() {
        System.out.println("HumanTrader: Risk checked by person.");
    }
}

public class Q12_lab10 {
    public static void main(String[] args) {
        TradingEngine.generalTradingPolicy();
        ComplianceEngine.generalCompliancePolicy();

        TradingEngine[] traders = {
                new AlgoTrader(),
                new HumanTrader()
        };

        for (TradingEngine t : traders) {
            t.runRiskChecks();
            t.placeOrder();
            System.out.println();
        }

        ComplianceEngine[] complianceList = {
                new AlgoTrader()
        };

        for (ComplianceEngine c : complianceList) {
            c.generateReport();
            c.logAuditTrail();
            System.out.println();
        }
    }
}
