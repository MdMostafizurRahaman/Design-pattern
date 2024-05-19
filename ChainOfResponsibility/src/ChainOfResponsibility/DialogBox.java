package ChainOfResponsibility;

class DialogBox extends Container {
    private String modalHelpText;

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            System.out.println("Modal help: " + modalHelpText);
        } else {
            super.showHelp();
        }
    }
}