package com.example.ankit.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button= (TextView) findViewById(R.id.button);
        button.setText("The Open System Interconnection (OSI) model defines a networking framework to implement protocols in seven layers.\n" +
                "The Open System Interconnection (OSI) model defines a networking framework to implement protocols in seven layers. In the OSI model, control is passed from one layer to the next, starting at the application layer in one station, and proceeding to the bottom layer, over the channel to the next station and back up the hierarchy.\n" +
                "The OSI Model is Not Tangible. There is really nothing to the OSI model. In fact, it's not even tangible. The OSI model doesn't perform any functions in the networking process. It is a conceptual framework so we can better understand complex interactions that are happening.\n" +
                "The OSI Model Layers\n" +
                "The OSI model takes the task of internetworking and divides that up into what is referred to as a vertical stack that consists of the following 7 layers.\n" +
                "\n" +
                "Physical (Layer 1)\n" +
                "OSI Model, Layer 1 conveys the bit stream - electrical impulse, light or radio signal — through the network at the electrical and mechanical level. It provides the hardware means of sending and receiving data on a carrier, including defining cables, cards and physical aspects. Fast Ethernet, RS232, and ATM are protocols with physical layer components.\n" +
                "Layer 1 Physical examples include Ethernet, FDDI, B8ZS, V.35, V.24, RJ45.\n" +
                "Data Link (Layer 2)\n" +
                "At OSI Model, Layer 2, data packets are encoded and decoded into bits. It furnishes transmission protocol knowledge and management and handles errors in the physical layer, flow control and frame synchronization. The data link layer is divided into two sub layers: The Media Access Control (MAC) layer and the Logical Link Control (LLC) layer. The MAC sub layer controls how a computer on the network gains access to the data and permission to transmit it. The LLC layer controls frame synchronization, flow control and error checking.\n" +
                "Layer 2 Data Link examples include PPP, FDDI, ATM, IEEE 802.5/ 802.2, IEEE 802.3/802.2, HDLC, Frame Relay. \n" +
                "Network (Layer 3)\n" +
                "Layer 3 provides switching and routing technologies, creating logical paths, known as virtual circuits, for transmitting data from node to node. Routing and forwarding are functions of this layer, as well as addressing, internetworking, error handling, congestion control and packet sequencing.\n" +
                "Layer 3 Network examples include AppleTalk DDP, IP, IPX.\n" +
                "Transport (Layer 4)\n" +
                "OSI Model, Layer 4, provides transparent transfer of data between end systems, or hosts, and is responsible for end-to-end error recovery and flow control. It ensures complete data transfer.\n" +
                "Layer 4 Transport examples include SPX, TCP, UDP.\n" +
                "Session (Layer 5)\n" +
                "This layer establishes, manages and terminates connections between applications. The session layer sets up, coordinates, and terminates conversations, exchanges, and dialogues between the applications at each end. It deals with session and connection coordination.\n" +
                "Layer 5 Session examples include NFS, NetBios names, RPC, SQL.\n" +
                "Presentation (Layer 6)\n" +
                "This layer provides independence from differences in data representation (e.g., encryption) by translating from application to network format, and vice versa. The presentation layer works to transform data into the form that the application layer can accept. This layer formats and encrypts data to be sent across a network, providing freedom from compatibility problems. It is sometimes called the syntax layer.\n" +
                "Layer 6 Presentation examples include encryption, ASCII, EBCDIC, TIFF, GIF, PICT, JPEG, MPEG, MIDI.\n" +
                "Application (Layer 7)\n" +
                "OSI Model, Layer 7, supports application and end-user processes. Communication partners are identified, quality of service is identified, user authentication and privacy are considered, and any constraints on data syntax are identified. Everything at this layer is application-specific. This layer provides application services for file transfers, e-mail, and other network software services. Telnet and FTP are applications that exist entirely in the application level. Tiered application architectures are part of this layer.\n" +
                "Layer 7 Application examples include WWW browsers, NFS, SNMP, Telnet, HTTP, FTP \n");


    }



}
