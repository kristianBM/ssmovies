import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';
function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="ssmovie-nav-content">
                    <h1>SSMovies</h1>
                    <a href="https://github.com/kristianBM">
                        <div className="ssmovie-contatct-container">
                            <GithubIcon />
                            <p className="ssmovie-contact-link">/kristianbm</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header >
    );
}

export default Navbar;